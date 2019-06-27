package code190613;

import java.util.Scanner;

public class ConceptQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[102];
        arr[1] = 6;arr[2] = 3;arr[3] = 1;arr[4] = 7;arr[5] = 5;arr[6] = 8;arr[7] = 9;arr[8] = 2;arr[9] = 4;
        int head = 1;
        int tail = 10;
        while (head < tail) {
            System.out.println(arr[head]);
            head++;
            arr[tail] = arr[head];
            tail++;
            head++;
        }
    }
}
