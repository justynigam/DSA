class Solution {
    public int singleNumber(int[] nums) {

        Map<Integer, Integer> r = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            r.put(num, r.getOrDefault(num, 0) + 1);
        }

        // Find number with frequency 1
        for (Map.Entry<Integer, Integer> entry : r.entrySet()) {

            if (entry.getValue() == 1) {
                return entry.getKey();
            }

        }

        return -1;
    }
}