class Solution {
    public int minimizeCost(int k, int arr[]) {
        int n = arr.length;
        int[] dp = new int[n + 1];
        
        dp[0] = 0;
        
        for(int i = 1 ; i < n ; i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j = 1 ; j <= k ; j++){
                if(i - j >= 0){
                    int cost = dp[i-j] + Math.abs(arr[i] - arr[i-j]);
                    
                    dp[i] = Math.min(cost , dp[i]);
                 }
            }
        }
        return dp[n-1];
    }
}
