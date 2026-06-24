
/*
78.Subset
Pattern - BackTracking and Recursion
Time complexity - O(N 2^N)
*/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, 0, new ArrayList<>(), res);
        return res;
    }

    public void dfs(int[] nums, int ind, List<Integer> current, List<List<Integer>> res){
        if(ind == nums.length){
            res.add(new ArrayList<>(current));
            return;
        }

        //taking
        current.add(nums[ind]);
        dfs(nums, ind + 1, current, res);

        //Not - taking
        current.remove(current.size() - 1);
        dfs(nums, ind + 1, current, res);
    }
}