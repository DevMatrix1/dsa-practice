//link: https://leetcode.com/problems/sudoku-solver

class sudokuSolver {
    //for checking 
    private boolean validate(int row, int col, char ch, char[][] board){

        for(int i = 0; i<9; i++){
            if(board[i][col] == ch || board[row][i] == ch)
                return false;
            if(board[(i/3) + (3*(row/3))][(i%3) + (3*(col/3))] ==  ch)
                return false;
        }

        return true;
    }
    private boolean solve(int row, int col, char[][] board){
        for(int i = row; i<9; i++){
            for(int j = 0; j<9; j++){
                char cur = board[i][j];
                if(cur == '.'){
                    for(char num = '1'; num <= '9'; num++){

                        if(validate(i, j, num, board)){
                            board[i][j] = num;
                            if(solve(i, j, board))
                                return true;

                        }

                        board[i][j] = '.';
                    }
                    return false;
                }
            }
            // col = 0;  
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        boolean result = solve(0, 0, board);

    }
}