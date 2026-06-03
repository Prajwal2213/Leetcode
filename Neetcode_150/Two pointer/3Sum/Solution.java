class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> final_res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int fixed = nums[i];
           twoSum(nums, i + 1, n-1, fixed, final_res);
           
        }
        return final_res;

    }

    public void twoSum(int[] nums, int start, int end,int fixed,List<List<Integer>> final_res){
            int comp_fixed = fixed * -1;

        while(start < end){
            int sum = nums[start] + nums[end];
            if(sum == comp_fixed){
                final_res.add(Arrays.asList(fixed, nums[start], nums[end]));
                start++;
                end--;

                while (start < end && nums[start] == nums[start - 1]) {
                    start++;
                }
                
                while (start < end && nums[end] == nums[end + 1]) {
                    end--;
                }
            }else if(sum > comp_fixed ){
                end--;
            }
            else start++;
        }
    }
}