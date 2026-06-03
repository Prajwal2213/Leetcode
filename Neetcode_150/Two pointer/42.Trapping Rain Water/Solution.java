class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] max_left = new int[n];
        int[] max_right = new int[n];

        
        int max = 0;
        int sum = 0;

        for(int left = 1; left < n; left++){
            int prev = height[left - 1];
            max = Math.max(prev, max);
            max_left[left] = max;
        }
        max = 0;

        for(int right = n - 2; right > 0; right--){
            int prev = height[right + 1];
            max = Math.max(prev, max);
            max_right[right] = max;
        }

        int min = 0;

        for(int i = 0; i < n; i++){
            min = Math.min(max_left[i], max_right[i]);
            int val = min - height[i];
            if(val > 0){
                sum += val;
            }
        }

        return sum;
 
    }
}