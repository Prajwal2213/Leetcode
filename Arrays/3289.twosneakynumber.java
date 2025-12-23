class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] res = new int[2];
        int j = 0;


        for(int i=0;i<nums.length;i++){
           for(int k = i+1;k<nums.length;k++){
                if(nums[i] == nums[k]){
                    res[j] = nums[i];
                    j++;
                    break;

                }
           }
        }
    return res;
    }
}