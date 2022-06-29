

def solve(n):
    # CODE HERE
    
    if(n==1):
        return 1
    if(n%2 != 0):  
        return 0
    n = n//2
    return solve(n)