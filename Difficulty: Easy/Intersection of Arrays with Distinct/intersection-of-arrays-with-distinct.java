
class Solution {
    public static int intersectSize(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = 0;
        int count = 0;
        while( i < a.length && j < b.length){
            if(a[i] == b[j]){
                count++;
                i++;
                j++;
            }else if(a[i] > b[j]){
                j++;
            }else{
                i++;
            }
        }
        return count;
        
    }
}