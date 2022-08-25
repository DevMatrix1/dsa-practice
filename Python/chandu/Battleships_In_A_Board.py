def solve(board):
    # CODE HERE
    l = len(board)
    r = len(board[0])
    kat = 0
    for i in range(l):
        for j in range(r):
            if board[i][j] == "X":
                if i==0 and j == 0:
                    kat +=1
                elif i==0:
                    if board[i][j-1] != "X":
                        kat += 1
                elif j==0:
                    if board[i-1][j] != "X":
                        kat += 1
                else:
                    if board[i-1][j] != "X" and board[i][j-1] != "X":
                        kat += 1
    return kat 
