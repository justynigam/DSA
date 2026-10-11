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
        ListNode temp = head;
        
        int c = 0;

        while(temp.next != null){
            temp = temp.next;
            c++;
        }
        if(c + 1 == n){
            return head.next;
        }

        temp = head;
        for(int i = 1 ; i < c - n + 1 ; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;

    }
}