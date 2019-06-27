package code190613;

import java.util.Scanner;

public class QuickSortReduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        arr[n] = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int temp = arr[left];
        int i = left;
        int j = right;
        while (i != j) {
            while (arr[j] >= temp && i < j) {
                j--;
            }
            while (arr[i] <= temp && i < j) {
                i++;
            }
            if (i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        arr[left] = arr[i];
        arr[i] = temp;

        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }
}
