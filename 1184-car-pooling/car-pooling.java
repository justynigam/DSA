import java.util.*;
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips , (a,b) -> a[1] - b[1]);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0] );

        int current = 0;

        for(int[] trip : trips){
            int passengers = trip[0];
            int from = trip[1];
            int to = trip[2];

            while(!pq.isEmpty() && pq.peek()[0] <= from){
                int[] completed = pq.poll();

                current -= completed[1];
            }
            current += passengers;

            if(current > capacity){
                return false;
            }
            pq.offer(new int[]{to , passengers});
        }
        return true;
    }
}