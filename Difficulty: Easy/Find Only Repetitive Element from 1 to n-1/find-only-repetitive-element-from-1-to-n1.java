// User function Template for Java
class Solution {
    public int findDuplicate(int[] arr) {
        // code here
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            if(set.add(i) == false){
                return i;
        }
        }
        return -1;
        }    
        
}