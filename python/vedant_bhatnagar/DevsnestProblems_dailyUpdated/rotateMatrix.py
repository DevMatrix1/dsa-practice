def solve(mat):
    # CODE HERE
    for row in mat:
        row.reverse()
    n = len(mat)
    for i in range(n):
        for j in range(n-i):
            mat[i][j], mat[n-j-1][n-i-1] = mat[n-j-1][n-i-1], mat[i][j]
    return mat