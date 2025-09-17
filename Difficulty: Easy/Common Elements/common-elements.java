// User function Template for Ja
import java.util.*;

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        Map<Integer, Integer> countMap = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

    
        for (int num : a) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

     
        for (int num : b) {
            if (countMap.containsKey(num) && countMap.get(num) > 0) {
                result.add(num);
                countMap.put(num, countMap.get(num) - 1);
            }
        }

        
        Collections.sort(result);
        return result;
    }
}
