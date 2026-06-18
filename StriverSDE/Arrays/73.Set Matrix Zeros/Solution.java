// My solution taken 13ms 
//Time complexity - O(N^2)
class Solution {
    public void setZeroes(int[][] matrix) {
        int row_ind = 0;
        int col_ind = 0;
        List<List<Integer>> ind = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    ind.add(Arrays.asList(i, j));
                }
            }
        }
        for (int i = 0; i < ind.size(); i++) {
            List<Integer> index = ind.get(i);
            row_ind = index.get(0);
            col_ind = index.get(1);
            setRowColZero(matrix, row_ind, col_ind);
        }
    }

    private void setRowColZero(int[][] matrix, int row, int col) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        //Set Rows Zeros
        for (int i = 0; i < numCols; i++) {
            matrix[row][i] = 0;
        }

        //Set column Zeros
        for (int i = 0; i < numRows; i++) {
            matrix[i][col] = 0;
        }

    }
}

//Optimal Solution  
//Time complexity - O(N ^ 2)

class Solution {
    public void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] row = new boolean[rows];
        boolean[] col = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}