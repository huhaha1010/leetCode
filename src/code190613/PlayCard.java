package code190613;

import pojo.MyQueue;

import java.util.Scanner;

public class PlayCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue queue1 = new MyQueue();
        queue1.data = new int[100];
        queue1.head = 0;
        queue1.tail = 0;
        MyQueue queue2 = new MyQueue();
        queue2.head = 0;
        queue2.tail = 0;
        queue2.data = new int[100];
        for (int i = 0; i < 6; i++) {
            queue1.data[i] = sc.nextInt();
            queue1.tail++;
        }
        for (int i = 0; i < 6; i++) {
            queue2.data[i] = sc.nextInt();
            queue2.tail++;
        }
        int[] book = new int[10];
        int t = 0;
        while (queue1.head < queue1.tail && queue2.head < queue2.tail) {
            t = queue1.data[queue1.head];
            queue1.head++;
            if (book[t] != 0) {
                queue1.data[queue1.tail] = t;
                queue1.tail++;
            }
        }
    }
}
