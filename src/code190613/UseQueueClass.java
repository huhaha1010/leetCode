package code190613;

import pojo.MyQueue;

import java.util.Scanner;

public class UseQueueClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyQueue queue = new MyQueue();
        queue.data = new int[2 * n];
        queue.head = 0;
        queue.tail = n;
        for (int i = 0; i < n; i++) {
            queue.data[i] = sc.nextInt();
        }
        while (queue.head < queue.tail) {
            System.out.println(queue.data[queue.head]);
            queue.head++;
            queue.data[queue.tail] = queue.data[queue.head];
            queue.tail++;
            queue.head++;
        }
    }
}
