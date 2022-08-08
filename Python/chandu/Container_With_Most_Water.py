def solve(n, arr):
    # CODE HERE
    # using two pointers....
    l, r = 0, n-1
    kat = 0
    while l<r:
        kat = max(kat, min(arr[l], arr[r])*(r-l))
        if arr[l]<arr[r]:
            l += 1
        else:
            r -= 1
    
    return kat
