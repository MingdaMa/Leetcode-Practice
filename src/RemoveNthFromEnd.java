/*
* https://leetcode.com/problems/remove-nth-node-from-end-of-list/
* */

public class RemoveNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void printNode(ListNode head) {
        ListNode current = head;
        if (head == null) {
            System.out.println("Linked list is empty");
        }
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = null;

        ListNode newHead = removeNthFromEnd(head, 2);

//        ListNode newHead = removeNthFromEnd(head, 1);
        printNode(newHead);
    }
}
