//link: https://leetcode.com/problems/set-matrix-zeroes/submissions/
//Approach : Most optimized approach TC: O(m*n), SC: O(1)

class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean firstColumn = false, firstRow = false;
        //marking rows and cols with 0
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(matrix[i][j] == 0){
                    if(i == 0)  firstRow = true;
                    if(j == 0)  firstColumn = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        //making whole row and col 0 which are marked 0
        //cols
        for(int i = 1; i<n; i++){
            if(matrix[i][0] == 0){
                for(int j = 0; j<m; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        //rows
        for(int j = 1; j<m; j++){
            if(matrix[0][j] == 0){
                for(int i = 0; i<n; i++){
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstColumn){
            for(int i = 0; i<n; i++){
                matrix[i][0] = 0;
            }
        }
        if(firstRow){
            for(int j = 0; j<m; j++){
                matrix[0][j] = 0;
            }
        }

    }
}