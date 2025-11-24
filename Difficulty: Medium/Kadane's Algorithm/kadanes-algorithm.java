class Solution {
    int maxSubarraySum(int[] arr) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            maxsum = Math.max(maxsum , sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxsum;
        
    }
}
