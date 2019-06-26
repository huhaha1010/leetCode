package code190613;

import java.util.Scanner;

public class ReduplicationSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1000];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[num] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                System.out.println(i);
            }
        }
    }
}
