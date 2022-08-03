def solve(n):
    # CODE HERE
    num = 1
    if (n<2):
        return 1
    else:
        while(n>0):
            num = num*n
            n = n-1
    return num