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
    public void reorderList(ListNode head) {

        if(head==null || head.next==null){
            return ;
        }
        // find middile element
        ListNode slow=head;
        ListNode fast=head;
    while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;

    }
    // reverse of half element
      ListNode prev=null;
      ListNode curr=slow.next;
      slow.next=null;
      while(curr!=null){
        ListNode nextNode=curr.next;
        curr.next=prev;
        prev=curr;
        curr=nextNode;
      }

      ListNode first=head;
      ListNode secound=prev;

      while(secound!=null){
        ListNode temp1=first.next;
        ListNode temp2=secound.next;

        first.next=secound;
        secound.next=temp1;

        first=temp1;
        secound=temp2;





      }
        
    }
}
