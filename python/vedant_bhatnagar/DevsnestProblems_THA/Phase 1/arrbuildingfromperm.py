def solve(n, arr):
    # CODE HERE
    ans = [-1] * n
    for i in range(0, n):
        ans[i] = arr[arr[i]]
    return ans
        