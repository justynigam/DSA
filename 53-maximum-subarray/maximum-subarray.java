class Solution {
    public int maxSubArray(int[] nums) {
        int l = nums[0];
        int r = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            l = Math.max(nums[i] , nums[i] + l);
            r = Math.max(r , l); 
        }
        return r;
    }
}