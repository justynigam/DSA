// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(k , Collections.reverseOrder());
        for(int a : arr){
            if(maxheap.size() < k){
                maxheap.offer(a);
            }else if(a < maxheap.peek()){
                maxheap.poll();
                maxheap.offer(a);
            }
        }
        return maxheap.peek();
        
    }
}
