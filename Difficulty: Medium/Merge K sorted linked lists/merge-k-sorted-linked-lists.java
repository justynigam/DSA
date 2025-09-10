/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node mergeKLists(Node[] arr) {
        if(arr == null || arr.length == 0) return null;
        
        PriorityQueue<Node> minheap = new PriorityQueue<>((a,b) -> a.data - b.data);
        
        for(Node node : arr){
            if(node != null){
             minheap.offer(node);
            }
        }
        
        Node dummy = new Node(0);
        Node curr = dummy;
        
        while(!minheap.isEmpty()){
            Node smallest = minheap.poll();
            curr.next = smallest;
            curr = curr.next;
            
            if(smallest.next != null){
                minheap.offer(smallest.next);
            }
        }
        return dummy.next;
        
    }
}