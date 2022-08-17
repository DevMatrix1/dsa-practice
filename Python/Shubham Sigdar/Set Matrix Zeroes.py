# 1st approach(TC-O(mn) SC-O(mn))


def solve(matrix): 
    m,n=len(matrix),len(matrix[0])
    temp = [[1]*n for i in range(m)] 
   
    for i in range(m): 
        for j in range(n):
            if matrix[i][j]==0:
                # set rpn range(n):
                for k in range(n): 
                    temp[i][k]=0
                # set col zero 
                for l in range(m): 
                    temp[l][j] =0
            
            if temp[i][j]:
                temp[i][j]=matrix[i][j] 
    return temp
print(solve([[0,1,2,0],[3,4,5,2],[1,3,1,5]]))




# 2nd approach(TC-O(mn) SC-O(m+n))

def solve(matrix):
    row=set() #{0}
    col=set() #{0,3}
    for i in range(len(matrix)):
        for j in range(len(matrix[0])):
            if matrix[i][j]==0:
                row.add(i)
                col.add(j)
    for r in row:
        for i in range(len(matrix[0])):
            matrix[r][i]=0  #make row 0
    for c in col:
        for j in range(len(matrix)):
            matrix[j][c]=0 #make col 0
    return matrix
print(solve([[0,1,2,0],[3,4,5,2],[1,3,1,5]]))


# 3rd approach(TC-O(mn) SC-O(1))

def solve(matrix):
    m,n=len(matrix),len(matrix[0])

    #Flag row and col
    row,col=False,False

    #first row, col mai 0 milaga col=True row=True
    for i in range(m):
        if matrix[i][0]==0:
            col=True
    for j in range(n):
        if matrix[0][j]==0:
            row=True
    
    #jha prh bhi 0 hai uss row and col ka first element ko 0 
    for i in range(m):
        for j in range(n):
            if matrix[i][j]==0:
                matrix[i][0]=0
                matrix[0][j]=0

    # us row ka andr jitna bhi col ka element hai usko 0 krdo 
    for i in range(1,m):
        if matrix[i][0]==0:
            for j in range(1,n):
                matrix[i][j]=0
    for j in range(1,n):
        if matrix[0][j]==0:
            for i in range(1,m):
                matrix[i][j]=0


    if row:
        for i in range(n):
            matrix[0][i]=0
    if col:
        for j in range(m):
            matrix[j][0]=0
    return matrix
                
print(solve([[0,1,1],[1,1,1],[1,0,1],[1,1,1]]))