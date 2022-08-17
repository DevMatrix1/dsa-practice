def solve(n, arr):
    max_water=0
    l=0
    r=len(arr)-1
    while l<r:
        hl, hr = arr[l], arr[r]
        curr_water = min(hl, hr)*(r-1)
        if curr_water > max_water:
            max_water = curr_water
        if hl<=hr:
            l+=1
        if hl>=hr:
            r-=1
    return max_water

