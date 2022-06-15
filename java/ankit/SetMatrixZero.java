// link- https://workat.tech/problem-solving/practice/row-column-zero

class Solution {
	void setRowColumnZeroes(int[][] matrix){
	    int [] rows=new int[matrix.length];
		int [] column=new int[matrix[0].length];
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					rows[i]=-1;
					column[j]=-1;
				}
			}
		}
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(rows[i]==-1){
					matrix[i][j]=0;
				}
			}
		}
		
		for(int i=0;i<matrix[0].length;i++){
			for(int j=0;j<matrix.length;j++){
				if(column[i]==-1){
					matrix[j][i]=0;
				}
			}
		}
		
		
	}
}