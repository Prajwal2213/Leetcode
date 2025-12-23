class Solution {
    public boolean check(int[] nums) {
        int ind;
        int org_ind = 0;
        int iter;
        int[] res = new int[nums.length];
        for(ind = 0;ind < nums.length-1;ind++){
            if(nums[ind] < nums[ind+1] || nums[ind] == nums[ind+1]){
                continue;
            }
            else{
                org_ind = ind+1;
            }
        }

        if(org_ind == 0){
            return true;
        }

        int counter = 0;
        for(ind = org_ind,iter = 0;ind < nums.length;ind++,iter++ ){
            res[iter] = nums[ind];
            counter++;
        }
        if(counter != nums.length){
            for(int i = 0; i<org_ind;i++){
                res[iter] = nums[i];
                counter++;
                iter++;
            }
        }

        for(int i = 0;i<nums.length-1;i++){
            if(res[i] < res[i+1] || res[i] == res[i+1]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}