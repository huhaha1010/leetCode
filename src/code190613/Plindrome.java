package code190613;

import java.util.Scanner;

public class Plindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mid = n / 2 - 1;
        int[] s = new int[n];
        int top = -1;
        for (int i = 0; i <= mid; i++) {
            top++;
            s[top] = arr[i];
        }
        int next = 0;
        if (n % 2 == 0) {
            next = mid + 1;
        } else {
            next = mid + 2;
        }
        for (int i = next; i < n; i++) {
            if (s[top] != arr[i]) {
                break;
            }
            top--;
        }
        if (top == -1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
