class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        
        int longestStreak = 0;
        for(int i:set){
            if(!set.contains(i - 1)){
                int currentNum = i;
                int currStreak = 1;

                while(set.contains(currentNum + 1)){
                    currentNum++;
                    currStreak++;
                }

                longestStreak = Math.max(longestStreak, currStreak);
            }
        }
        return longestStreak;
    }
}