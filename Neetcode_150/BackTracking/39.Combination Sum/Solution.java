/*
39.Combination Sum
Pattern - Array and Backtracking
Time Complexity - O(N ^ K) 
N - No of elements in the Array -> branching Factor
K - Depth of the Tree 

k = T/M 
T - Target
M - smallest number in array
*/


class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        solve(0,candidates, target, new ArrayList<>(), res);
        return res;
        
    }

    public void solve(int ind, int[] arr, int rem_target, List<Integer> set, List<List<Integer>> res){
        //base Case
        if(rem_target == 0){
            res.add(new ArrayList<>(set));
            return;
        }

        //backtrack
        if(rem_target < 0){
            return;
        }

        for(int i = ind; i < arr.length; i++){
            set.add(arr[i]);
            solve(i, arr, rem_target - arr[i], set, res);
            set.remove(set.size() - 1);
        }
    }
}