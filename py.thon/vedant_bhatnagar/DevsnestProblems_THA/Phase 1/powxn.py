def solve(x, n):
    # return x**n
    if n==0:
        return 1
    isxneg, isnneg = x<0, n<0
    x,n = abs(x),abs(n)

    halfans = solve(x, n//2)

    if n%2 == 0:
        ans = halfans * halfans
    else:
        ans = halfans * halfans * x
    
    if isxneg and n%2==1:
        ans = -ans
    if isnneg:
        ans = 1/ans

    return ans 