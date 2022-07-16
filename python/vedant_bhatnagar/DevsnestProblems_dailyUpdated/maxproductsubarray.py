def solve(n, arr):
    # CODE HERE
    res = max(arr)
    curMin = curMax = 1
    for i in arr:
        if i == 0:
            curMin = curMax = 1
            continue
        tmp = curMax*i
        curMax = max(i*curMax, i*curMin, i)
        curMin = min(tmp, i*curMin, i)
        res = max(res,curMax)
    return res