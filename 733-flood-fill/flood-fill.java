class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialcolor = image[sr][sc];

        Queue<int[]> q = new LinkedList<>();
        if(initialcolor != color){
            q.offer(new int[]{sr , sc});
            image[sr][sc] = color;
        }
        int[][] dir = {{1,0} , {-1 , 0} , {0 , 1} , { 0 , -1}};

        while(!q.isEmpty()){
            int size = q.size();

            for(int k = 0 ; k < size ; k++){
                int[] curr = q.poll();

                for(int[] d : dir){
                    int x = curr[0] + d[0];
                    int y = curr[1] + d[1];

                    if(x >= 0 && y >= 0 && x < image.length && y < image[0].length && image[x][y] == initialcolor){
                        image[x][y] = color;
                        q.offer(new int[]{x,y});
                    }
                }
            }
        }
        return image;
    }

}