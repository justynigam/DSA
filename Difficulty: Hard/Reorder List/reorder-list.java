/* Following is the Linked list node structure */

/*class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    void reorderlist(Node head) {
        if(head == null || head.next == null || head.next.next == null){
            return;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondhead = slow.next;
        slow.next = null;
        
        secondhead = reverselist(secondhead);
        Node firsthead = head;
        
        while(secondhead != null){
            Node temp1 = firsthead.next;
            Node temp2 = secondhead.next;
            
            firsthead.next = secondhead;
            secondhead.next = temp1;
            
            firsthead = temp1;
            secondhead = temp2;
        }
        
        
    }
    private Node reverselist(Node node){
        Node prev = null;
        Node curr = node;
        Node next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev  = curr;
            curr  = next;
        }
        return prev;
    }
}