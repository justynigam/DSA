// User function Template for Java
class Solution {
    String reverseWithSpacesIntact(String S) {
       char[] arr = S.toCharArray();
       int i = 0 , j = S.length()-1;
       
       while(i < j){
           if(arr[i] == ' '){
             i++;
           }else if(arr[j] == ' '){
             j--;
           }else{
               char temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               i++;
               j--;
           }     
       }
       return String.valueOf(arr);
        
    }
}