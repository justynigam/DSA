class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int maxcount = 0;
        int maxint = Integer.MIN_VALUE;

        for(int num : nums){
            int count = map.getOrDefault(num , 0) + 1;
            map.put(num , count);
        }

        for(int freq : map.values()){
            maxint = Math.max(freq , maxint);
        }
        for(int freq : map.values()){
            if(freq == maxint){
                maxcount += maxint;
            }
        }
        return maxcount;
        
    }
}
