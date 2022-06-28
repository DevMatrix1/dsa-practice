def solve(n, arr):
    # CODE HERE
    arr.sort()
    num = max(arr)
    for i in arr[::-1]:
        if(i != num):
            return i
