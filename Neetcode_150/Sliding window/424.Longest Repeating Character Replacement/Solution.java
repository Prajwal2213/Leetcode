class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int maxFreq = 0;
        int n = s.length();
        int[] hash = new int[26];
        while (right < n) {
            hash[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(right) - 'A']);

            if (((right - left + 1) - maxFreq) > k) {
                hash[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, (right - left + 1));

            right++;

        }

        return maxLen;

    }
}