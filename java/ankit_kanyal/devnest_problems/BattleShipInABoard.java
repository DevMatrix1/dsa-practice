// link- https://devsnest.in/algo-challenges/battleships-in-a-board

static int solve(String[][] board){
//CODE HERE 
    int n=board.length;
    int m=board[0].length;
        
    int count=0;
        
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if((board[i][j].equals("X")) 
                && (i==0 || (i-1>=0 && !board[i-1][j].equals("X"))) 
                && (j==0 || (j-1>=0 && !board[i][j-1].equals("X")))) 
                count++;
              
            }
            
        }
        return count;
}