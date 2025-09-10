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
    public ListNode check(ListNode l1 , ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        if(l1.val <= l2.val){
            l1.next = check(l1.next , l2);
            return l1;
        }else{
            l2.next = check(l2.next , l1);
            return l2;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        return dandc(lists , 0 , lists.length - 1);
        
    }
    private ListNode dandc(ListNode[] lists , int l , int r){
        if(l == r) return lists[l];
        int mid =  l + (r-l)/2;
        ListNode l1 = dandc(lists , l , mid);
        ListNode l2 = dandc(lists , mid + 1 , r);
        return check(l1 , l2);
    }
}