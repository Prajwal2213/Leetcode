class Solution {
    public int repeatedNTimes(int[] nums) {
        int max = 0;
        for (int x : nums) max = Math.max(max, x);

        int[] freq = new int[max + 1];
        
        for(int iter = 0;iter <nums.length; iter++){
            freq[ nums[iter]  ] += 1;
        }
        for(int iter = 0;iter < freq.length ; iter++){
            if(freq[iter] > 1){
                return iter ;
            }
        }

        return -1;
    }
}