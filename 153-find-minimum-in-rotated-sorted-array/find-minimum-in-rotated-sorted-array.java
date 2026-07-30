class Solution {
    public int findMin(int[] nums) {
        int m = nums[0];
        for(int i = 0 ; i < nums.length ; i++){
            if(m > nums[i]){
                m = nums[i];
            }
        }
        return m;
    }
}