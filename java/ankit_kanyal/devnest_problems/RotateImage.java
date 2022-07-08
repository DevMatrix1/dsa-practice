// link- https://devsnest.in/algo-challenges/rotate-image

static int[][] solve(int[][] mat){
//CODE HERE 
    int rows=mat.length;
    int columns=mat[0].length;

    // transpose the matrix
    for(int row=0;row<rows;row++){
        for(int column=row;column<columns;column++){
            int temp=mat[row][column];
            mat[row][column]=mat[column][row];
            mat[column][row]=temp;
        }
    }


    // reverse the rows

    int start=0,end=rows-1;
   
    while(start<end){
        int rowIndex=0;
        while(rowIndex<rows){
            int temp=mat[rowIndex][start];
            mat[rowIndex][start]=mat[rowIndex][end];
            mat[rowIndex][end]=temp;
            rowIndex++;
        }
        start++;
        end--;
    }

    return mat;
}

