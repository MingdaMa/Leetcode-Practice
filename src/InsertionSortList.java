/*
* https://leetcode.com/problems/insertion-sort-list/
* */

public class InsertionSortList {
    public static ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        // have prev so that the node can be inserted between prev and current
        ListNode prev = head;
        ListNode current = head.next;

        while (current != null) {
            if (current.val >= prev.val) {
                prev = current;
                current = current.next;
                continue;
            }
            ListNode temp = dummy;
            while (current.val > temp.next.val) {
                temp = temp.next;
            }
            prev.next = current.next;
            current.next = temp.next;
            temp.next = current;
            current = prev.next;
        }
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
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        ListNode newHead = insertionSortList(head);
        printNode(newHead);
    }
}
