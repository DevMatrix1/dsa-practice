def solve(n):
    # CODE HERE
    n0 = 0
    n1 = 1
    if (n==0):
        return 0
    elif (n==1):
        return 1
    else:
        for i in range(n-1):
            temp = n0 + n1
            n0 = n1 
            n1 = temp

    return temp