/*
46.Permutations
Pattern - Backtracking 
Time complexity - O( N X N!)

*/


class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(0, nums, res);
        return res;
    }

    public void solve(int ind, int[] arr, List<List<Integer>> res){
        //base Case
        if(ind == arr.length){
            List<Integer> current = new ArrayList<>();
            for(int num: arr){
                current.add(num);
            }
            res.add(current);
            return;
        }

        for(int j = ind ; j < arr.length; j++){
            swap(arr, ind, j);
            solve(ind + 1, arr, res);
            swap(arr, ind, j);
        }
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}