package code190613;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        for (int p = 0; p < 5; p++) {
            int num = sc.nextInt();
            arr[num]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                for (int j = 0; j < arr[i]; j++) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
