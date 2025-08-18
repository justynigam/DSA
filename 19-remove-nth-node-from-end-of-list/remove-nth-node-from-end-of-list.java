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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }

        ListNode temp = head;
        int count  = 0;
        while(temp != null){
            temp  = temp.next;
            count++;
        }
        if(n == count){
            return head.next;
        }
        int k = count - n;
        ListNode start = head;
        for(int i = 0 ; i < k - 1 ; i++){
             start = start.next;
        }
        start.next = start.next.next;
        return head;
    }
}