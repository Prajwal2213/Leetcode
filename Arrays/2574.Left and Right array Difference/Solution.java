class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n ];
        int[] rightSum = new int[n];
        int[] ans = new int[n];
        int sum = 0;
        leftSum[0] = 0;
        rightSum[n-1] = 0;

        //leftSum
        for(int leftIter = 0; leftIter < n - 1 ; leftIter++){
            sum += nums[leftIter];
            leftSum[leftIter + 1] = sum;
        }
        //RightSum
        sum = 0;
        for(int rightIter = n-1; rightIter >= 1 ; rightIter--){
           sum += nums[rightIter];
           rightSum[rightIter - 1] = sum;
           //answer 
           ans[rightIter] = Math.abs(leftSum[rightIter] - rightSum[rightIter]);
        }
        
        //initial Index Sum
        ans[0] = Math.abs(leftSum[0] - rightSum[0]);

        
        return ans;
    }
}