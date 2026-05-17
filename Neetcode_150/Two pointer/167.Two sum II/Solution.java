public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int n = numbers.length;
        int right = n - 1;
        int[] res = new int[2];


        //optimal Solution
        while (left < right) {
            int currSum = numbers[left] + numbers[right];
            if (currSum == target) {
                res[0] = left + 1;
                res[1] = right + 1;
            }
            if (currSum > target){
                right--;
            }else{
                left++;
            }
        }
            return res;
    }
}




class Solution1 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = 0;
        int n = numbers.length;
        int[] res = new int[2];

        //brute-force 
        for( left = 0; left < n; left++){
            int val = target - numbers[left];
            for(right = left + 1; right < n; right++){
                if(val == numbers[right]){
                    res[0] = left + 1;
                    res[1] = right + 1;
                    break;
                }
            }
        }

        return res;
    }
}

