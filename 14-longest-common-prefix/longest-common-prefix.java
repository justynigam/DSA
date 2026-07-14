class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int minlength = Math.min(first.length() , last.length());
        int i = 0;
        while(i < minlength && first.charAt(i) == last.charAt(i)){
            sb.append(first.charAt(i));
            i++;

        }
        return sb.toString();
    }
}