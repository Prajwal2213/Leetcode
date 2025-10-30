public class singleNumber_136{
    public int singleNumber(int[] nums) {
        int val = 0;
        for(int i=0;i<nums.length;i++){
        val = counter(nums[i],nums);
        if(val == 1){   
            return nums[i];
        }
    }

    return nums[0];
    }

    
     static int counter(int n,int[] nums){
        int c = 0;
        for(int num : nums){
            if(num == n){
                c++;
            }
        }
    return c;

    }
}


//optimal solution

/*
 * class Solution {
   public int singleNumber(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            index=index^nums[i];
        }
        
        return index;
    }
}
 */