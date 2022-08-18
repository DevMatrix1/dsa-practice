# 1st method 
# InBuilt way
def solve(x, n):
    return x**n

# 2nd method 
# Use for loop o(n)
def solve(x, n):
    a=1
    for c in range(0,n):
        a*=x
    return a

# 3rd method
# Use Recursion o(logn)
# 1. We make the power half x^n = x^n/2 * x^n/2
#    myPow(x,5) -> myPow(x,2) -> myPow(x,1)
#   3^4 ->81
#  -3^4 ->81
#  -3^3 ->-27
#  3^-3 ->- 1/27

def solve(x, n):
    # flag 
    isxneg, isnneg = x<0, n<0
    x,n=abs(x),abs(n)

    # base case
    if n==0:
        return 1
    if n==1:
        return 1/x if isnneg else x
    halfans=solve(x,n//2)

    # main algo
    if n%2==1:
        ans = halfans * halfans * x
    else:
        ans = halfans * halfans
    
    if isxneg and n%2==1:
        ans=-ans
    if isnneg:
        ans=1/ans
    return ans