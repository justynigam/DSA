class Solution {
    void selectionSort(int[] arr) {
        int n = arr.length;
        
        for(int i = 0 ; i < n - 1 ; i++){
            int mins = i;
            for(int j = i + 1 ; j < n ; j++){
                if(arr[j] < arr[mins]){
                    mins = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mins];
            arr[mins] = temp;
            
        }
        
    }
}