package code190613;

import java.util.*;

public class ClassSort {
    static class Student {
        String name;
        int score;
        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> list = new ArrayList<>();
        for (int p = 0; p < n; p++) {
            list.add(new Student(sc.next(), sc.nextInt()));
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).score < list.get(j + 1).score) {
                    list.set(i, list.set(j, list.get(i)));
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name + " " + list.get(i).score);
        }
    }
}
