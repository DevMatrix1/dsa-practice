def solve(n, arr):
    X=0
    for i in range(n):
        if arr[i]=="X++" or arr[i]=="++X":
            X=X+1 
        if arr[i]=="--X" or arr[i]=="X--":
            X=X-1
    return X
