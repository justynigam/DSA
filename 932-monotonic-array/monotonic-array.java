class Solution {
    public boolean isMonotonic(int[] nums) {
        int i = 0;
        int j = 1;
        int n =nums.length;
        int step1 = 0;
        int step2 = 0;

        while(j < n){
            
            if(nums[i] < nums[j]){
                
                step1=1;
            }else if(nums[i] > nums[j]){
                
                step2=1;

            }
            if(step1 == 1 && step2 == 1){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}