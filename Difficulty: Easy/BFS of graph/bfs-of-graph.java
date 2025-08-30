class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;
        
        while(!q.isEmpty()){
            int node = q.poll();
            result.add(node);
            
            for(int i : adj.get(node)){
                if(visited[i] == false){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        return result;
    }
}