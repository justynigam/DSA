class Solution {
    public void nearlySorted(int[] arr, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        int index = 0;
        int n = arr.length;
        
        for(int i = 0 ; i < n ; i++){
            minheap.offer(arr[i]);
            if(minheap.size() > k){
                arr[index++] = minheap.poll();
            }
            
            }
            while(!minheap.isEmpty()){
                arr[index++] = minheap.poll();
        }
        
    }
}
