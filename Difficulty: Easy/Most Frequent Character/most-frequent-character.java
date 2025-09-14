class Solution {
    public char getMaxOccuringChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxcount = 0;
        char maxchar = '{';
        
        for(char c : str.toCharArray()){
            int count = map.getOrDefault(c, 0) + 1;
            map.put(c, count);
            
            if(count > maxcount || (count == maxcount && c < maxchar)){
                maxcount = count;
                maxchar = c;
            }
        }
        return maxchar;
    }
}
