class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int iter = 0; iter < nums.length; iter++){
            int elem = target - nums[iter];

            if(map.containsKey(elem) && map.get(elem) != iter){
                return new int[] {iter, map.get(elem)};
            }

            map.put(nums[iter], iter);
        }

        return new int[] {};
    }
}