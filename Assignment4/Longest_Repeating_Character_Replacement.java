package Assignment4;

    class Solution {
    public int characterReplacement(String s, int k) {
         int n = s.length();
        int[] count = new int[26];
        int si = 0;
        int maxl = 0;
        int maxc = 0;
        for(int i=0; i<n; i++){
            count[s.charAt(i)-'A']++;
            int currc = count[s.charAt(i)-'A'];
            maxc = Math.max(maxc, currc);
            while(i-si-maxc+1>k){
                count[s.charAt(si)-'A']--;
                si++;

            }
            maxl = Math.max(maxl, i-si+1);
        }
        return maxl;
    }
}

