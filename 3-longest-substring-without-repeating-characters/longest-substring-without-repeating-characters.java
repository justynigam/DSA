class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> sets = new HashSet<>();
        int l = 0 ,  r = 0 , max_length = 0;

        while(r < s.length()){
            if(!sets.contains(s.charAt(r))){
                sets.add(s.charAt(r));
                max_length = Math.max(max_length , r - l + 1);
                r++;
            }else{
                sets.remove(s.charAt(l));
                l++;
            }
        }
        return max_length;
    }
}