package test;

import pojo.ListNode;

public class ListNodeInitTest {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        ListNode head = listNode.init(10);
        System.out.println(head.toString());
    }
}
