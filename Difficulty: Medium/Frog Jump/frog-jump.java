class Solution {
    int minCost(int[] height) {
        int n = height.length;
        
        int[] dp = new int[n+1];
        
        dp[0] = 0;
        
        for(int i = 1 ; i < n ; i++){
            dp[i] = Integer.MAX_VALUE;
            
            for(int j = 1 ; j <= 2 ; j++){
                if(i - j >= 0){
                    int cost = dp[i - j] + Math.abs(height[i] - height[i - j]);
                    
                    dp[i] = Math.min(dp[i] , cost);
                }
                
            }
            
        }
        return dp[n - 1];
        
    }
}