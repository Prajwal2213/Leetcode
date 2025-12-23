class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0,count = 0;

        for(int val:nums){
            count = (val == 1) ? count+1 : 0;
            max = Math.max(count,max);
        }

       return max;

    }
}