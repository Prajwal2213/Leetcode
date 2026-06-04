/*
74.Seacrh A 2D matrix
Pattern - Binary search
Time complexity - O(log(m) + log(n))
space - O(1) 
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {


        int top = 0;
        int bot = matrix.length - 1;

        while (top <= bot) {
            int mid = (top + bot) / 2;
            
            if (matrix[mid][0] < target && matrix[mid][matrix[mid].length - 1] > target) {
                break;
            } else if (matrix[mid][0] > target) {
                bot = mid - 1;
            } else {
                top = mid + 1;
            }
        }
       
      //Finding the target in only single row
            int row = (top + bot) / 2;
            int left = 0;
            int right = matrix[row].length - 1;

            while(left <= right){
                int mid = left + (right - left) / 2;
                if (matrix[row][mid] == target) return true;
                else if (matrix[row][mid] < target) left = mid + 1;
                else right = mid - 1;
            }
       

       return false;
        
    }
}