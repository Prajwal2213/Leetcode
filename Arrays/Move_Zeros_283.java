class Solution {
    public void Move_Zeros_283(int[] nums) {
        int point = 0;
      for(int i=0;i<nums.length;i++){
        if(nums[i] != 0){
            nums[point] = nums[i];
            point++;
        }
      }
      while(point < nums.length){
        nums[point] = 0;
        point++;
      }
    
    }
  
}