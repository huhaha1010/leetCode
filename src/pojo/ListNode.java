package pojo;

public class ListNode {
    public int val;

    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode init(int size) {
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        for (int i = 0; i < size; i++) {
            pre.next = new ListNode((int)(Math.random() * 10));
            pre = pre.next;
        }
        return dummy.next;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        ListNode head = this;
        while (head.next != null) {
            sb.append(head.val + "->");
            head = head.next;
        }
        sb.append(head.val);
        return sb.toString();
    }
}
