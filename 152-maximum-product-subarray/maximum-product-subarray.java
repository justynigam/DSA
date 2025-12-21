class Solution {
    public int maxProduct(int[] nums) {
        int maxsofar = nums[0];
        int minsofar = nums[0];
        int ans = nums[0];

        for(int i = 1 ; i < nums.length; i++){
            int x = nums[i];
            int tempmax = Math.max(x , Math.max(x * maxsofar , x * minsofar)); 
            int tempmin = Math.min(x , Math.min(x * maxsofar , x * minsofar));
            maxsofar = tempmax;
            minsofar = tempmin;

            ans = Math.max(ans , maxsofar); 
        }
        return ans;
    }
}