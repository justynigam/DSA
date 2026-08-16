class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> sets = new HashSet<>();

        int l = 0 , r = 0 , maxs = 0;

        while(r < s.length()){
            if(!sets.contains(s.charAt(r))){
                sets.add(s.charAt(r));

                maxs = Math.max(maxs , r - l + 1);
                r++;
            }else{
                sets.remove(s.charAt(l));
                l++;
            }
        }
        return maxs;
    }
}