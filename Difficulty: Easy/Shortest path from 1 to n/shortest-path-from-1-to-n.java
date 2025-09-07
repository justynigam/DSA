class Solution {
    public int minStep(int n) {
        if(n == 1) return 0;
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        q.offer(n);
        visited.add(n);
        int step = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            step++;
            
            for(int i = 0 ; i < size ; i++){
                int curr = q.poll();
                
                int prev1 = curr - 1;
                if(prev1 == 1) return step;
                if(prev1 > 1 && !visited.contains(prev1)){
                    visited.add(prev1);
                    q.offer(prev1);
                }
                
                if(curr % 3 == 0){
                    int prev2 = curr/3;
                    if(prev2 == 1) return step;
                    if(prev2 > 1 && !visited.contains(prev2)){
                        visited.add(prev2);
                        q.offer(prev2);
                    }
                }
            }
            
        }
        return -1;
        
        
    }
}
