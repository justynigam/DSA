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
        if(head == null || head.next == null || head.next.next == null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondhead = slow.next;
        slow.next = null;
        
        secondhead = reverselist(secondhead);
        ListNode firsthead = head;
        
        while(secondhead != null){
            ListNode temp1 = firsthead.next;
            ListNode temp2 = secondhead.next;
            
            firsthead.next = secondhead;
            secondhead.next = temp1;
            
            firsthead = temp1;
            secondhead = temp2;
        }
        
        
    }
    private ListNode reverselist(ListNode node){
        ListNode prev = null;
        ListNode curr = node;
        ListNode next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev  = curr;
            curr  = next;
        }
        return prev;
    }
}