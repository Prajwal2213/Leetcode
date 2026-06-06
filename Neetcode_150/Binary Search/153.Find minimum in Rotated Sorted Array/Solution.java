/*
153.Find Minimum In Rotated Array
Pattern - Binary Search
Time complexity - O(log n)
Space complexity - O(1)
*/


class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        int left = 0;
        int right = nums.length - 1;
        int minimum = Integer.MAX_VALUE;

        while(left < right ){
            //calculate Mid
            int mid = left + ((right - left) >> 1); // Right Shift Operator

            //if mid value is greater than right value move the left to mid + 1
           if(nums[mid] > nums[right]){
            left = mid + 1;
           }else{
            right = mid ;
           }
        }

        return nums[left];
    }
}