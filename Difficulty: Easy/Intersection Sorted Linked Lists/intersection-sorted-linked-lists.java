/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        
        Node curr = head2;
        Set<Integer> set = new HashSet<>();
        
        while(curr != null){
            set.add(curr.data);
            curr = curr.next;
        }
        
        Node dummy = new Node(-1);
        Node newnode = dummy;
        
        Node curr1 = head1;
        while(curr1 != null){
            if(set.contains(curr1.data)){
                newnode.next = new Node(curr1.data);
                newnode = newnode.next;
                set.remove(curr1.data);
            }
            curr1 = curr1.next;
        }
        return dummy.next;
    }
}