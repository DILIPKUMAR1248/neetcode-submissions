/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {

    // Reverse a linked list
    public ListNode reverse(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    // Make a deep copy of the list
    public ListNode copyList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (head != null) {
            tail.next = new ListNode(head.val);
            tail = tail.next;
            head = head.next;
        }

        return dummy.next;
    }

    public void reorderList(ListNode head) {

        if (head == null || head.next == null)
            return;

        // Find size
        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Copy list
        ListNode copy = copyList(head);

        // Reverse copied list
        ListNode rev = reverse(copy);

        temp = head;

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        for (int i = 0; i < size; i++) {

            if (i % 2 == 0) {
                tail.next = new ListNode(temp.val);
                temp = temp.next;
            } else {
                tail.next = new ListNode(rev.val);
                rev = rev.next;
            }

            tail = tail.next;
        }

        // Copy values back to original list
        temp = head;
        ListNode ans = dummy.next;

        while (temp != null && ans != null) {
            temp.val = ans.val;
            temp = temp.next;
            ans = ans.next;
        }
    }
}