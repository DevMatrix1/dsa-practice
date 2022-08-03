def solve(n, arr):
    # CODE HERE
    ans = [arr[0]]
    for el in arr:
        if ans[-1] != el:
            ans.append(el)
    return ans