class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> hs = new HashSet<>();
        
        for(int num : arr1){
            String s = String.valueOf(num);
            for(int i = 1 ; i <= s.length() ; i++){
                hs.add(s.substring(0 , i));
            }
        }
        int ans = 0;
        for(int num : arr2){
            String s = String.valueOf(num);
            for(int i = 1 ; i <= s.length() ; i++){
                if(hs.contains(s.substring(0 , i))){
                   ans = Math.max(ans , i);
                }
            }
        }
        return ans;
    }
}