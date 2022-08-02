def solve(n, arr):
    # CODE HERE
    ans = 1
    haszero = False
    for i in arr:
        if i == 0:
            haszero = True
        else:
            ans = ans*i
    for i in range(0, len(arr)):
        if haszero:
            if arr[i] == 0:
                arr[i] = ans
            else:
                arr[i] = 0
        else:
            arr[i] = ans//arr[i]
    return arr