class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        for(char i : tasks){
            freq[i - 'A']++;
        }

        int maxfreq = 0;

        for(int i : freq){
            maxfreq = Math.max(i , maxfreq);
        }
        int countfreq = 0;

        for(int i : freq){
            if(i == maxfreq){
                countfreq++;
            }
        }
        int ans = (maxfreq - 1) * (n + 1) + countfreq;
        return Math.max(tasks.length , ans);
    }
}