import java.util.HashMap;
import java.util.Arrays;

public class TwoSum1 {
    public static void main(String[] args){
        int[] nums = {3,2,4};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));


    }

    static int[] twoSum(int[] nums,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i],i);

        }
        return new int[]{};
}
}