// link- https://devsnest.in/algo-challenges/number-of-islands?tab=question

static int solve(int[][] grid){
//CODE HERE
int count=0;
    for(int i=0;i<grid.length;i++)
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==1){
                dfsFill(grid,i,j);
                count++;
            }
        }
    return count; 
}

static void dfsFill(int[][] grid,int i, int j){
    if(i>=0 && j>=0 && i<grid.length && j<grid[0].length&&grid[i][j]==1){
        grid[i][j]=0;
        dfsFill(grid, i + 1, j);
        dfsFill(grid, i - 1, j);
        dfsFill(grid, i, j + 1);
        dfsFill(grid, i, j - 1);
    }
}