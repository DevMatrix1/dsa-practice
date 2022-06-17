// link- https://workat.tech/problem-solving/practice/matrix-rotation

class Solution {
	int[][] rotateMatrix(int[][] matrix){
	    int [][] rotatedMatrix=new int[matrix[0].length][matrix.length];
		int rowStart=matrix.length-1;
		int colStart=matrix[0].length-1;
	
		for(int i=0;i<=colStart;i++){

            for(int j=0;j<=rowStart;j++){

                rotatedMatrix[i][j]=matrix[rowStart-j][i];
                


            }
		}
		
		return rotatedMatrix;
	}
}