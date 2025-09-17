class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums1){
            set.add(i);
        }
        Set<Integer> inter = new HashSet<>();
        for(int i : nums2){
            if(set.contains(i)){
              inter.add(i);
            }
        }
        int[] ans = new int[inter.size()];
        int i = 0;
        for(int num : inter){
            ans[i++] = num;
        }
        return ans;
    }
}