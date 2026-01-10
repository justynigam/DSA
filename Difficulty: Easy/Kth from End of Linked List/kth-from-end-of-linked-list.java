/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        
        Node curr = head;
        int count = 0;
        while(curr != null){
            curr = curr.next;
            count++;
        }
        if(k > count){
            return -1;
        }
        int steps = count - k;
        curr = head;
        for(int i = 0 ; i < steps ; i++){
            curr = curr.next;
        }
        return curr.data;
    }
}