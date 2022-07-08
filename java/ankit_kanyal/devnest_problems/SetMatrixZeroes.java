// link- https://devsnest.in/algo-challenges/set-matrix-zeroes

static int[][] solve(int[][] matrix){
//CODE HERE 
int rows=matrix.length,columns=matrix[0].length;
int cornerMost=matrix[0][0];

boolean firstColumn=false;


for(int row=0;row<rows;row++){
    if(matrix[row][0]==0) firstColumn=true;
    for(int column=1;column<columns;column++){
        if(matrix[row][column]==0){
            matrix[0][column]=0;
            matrix[row][0]=0;
        }
    }
}

for(int row=rows-1;row>=0;row--){
    for(int column=columns-1;column>=1;column--){
        if(matrix[row][0]==0 || matrix[0][column]==0){
            matrix[row][column]=0;
        }
    }
    if(firstColumn){
        matrix[row][0]=0;
    }
}

return matrix;
}