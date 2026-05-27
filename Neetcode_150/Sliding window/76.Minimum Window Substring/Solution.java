class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (char c : t.toCharArray()) {
            letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int req = t.length();
        int minWin = Integer.MAX_VALUE;
        int start_i = 0;

        while (right < s.length()) {
            char z = s.charAt(right);
            if (letterCount.containsKey(z) && letterCount.get(z) > 0) {
                req--;
            }

            letterCount.put(z, letterCount.getOrDefault(z, 0) - 1);

            //shrinking
            while (req == 0) {
                int curr = right - left + 1;

                if (minWin > curr) {
                    minWin = curr;
                    start_i = left;
                }

                char startChar = s.charAt(left);
                letterCount.put(startChar, letterCount.getOrDefault(startChar, 0) + 1);

                if (letterCount.containsKey(startChar) && letterCount.get(startChar) > 0) {
                    req++;
                }
                left++;
            }
            right++;

        }
        return minWin == Integer.MAX_VALUE ? "" : s.substring(start_i, start_i + minWin);

    }
}