class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 0;
        if (nums.length == 0) return 0;
        while(true){
            if(nums[left] == nums[right]){
                right++;
            }
            else if(nums[left] < nums[right]){
                nums[left + 1] = nums[right];
                left++;
            }
            
            if(right == nums.length){
                break;
            }
        }
        return left+1;
    }
}


