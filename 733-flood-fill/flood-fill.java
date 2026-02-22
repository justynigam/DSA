class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialcolor = image[sr][sc];
        if(initialcolor != color){
            dfs(image , sr , sc  , initialcolor , color);
        }
        return image;

        
    }
    private void dfs(int[][] image , int r , int c , int initialcolor ,  int newcolor){
        if(r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != initialcolor){
            return;
        }
        image[r][c] = newcolor;

        dfs(image , r + 1 , c , initialcolor , newcolor);
        dfs(image , r, c - 1 , initialcolor , newcolor);
        dfs(image , r - 1 , c , initialcolor , newcolor);
        dfs(image , r , c + 1 , initialcolor , newcolor);
    }
}