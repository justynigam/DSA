/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node curr = dummy;
        
        for(int i = 0 ; i < x - 1 ; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        
        return dummy.next;
        
        
    }
}