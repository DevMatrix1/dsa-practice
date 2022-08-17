def solve(n, arr):
    ans=n
    for i in range(n):
        ans=ans^i^arr[i]
    return ans