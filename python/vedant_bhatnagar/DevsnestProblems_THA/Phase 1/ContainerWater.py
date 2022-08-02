def solve(n, arr):
    # CODE HERE
    i = 0
    j = len(arr) - 1
    max_water = -10^4
    while(i<j):
        h1, h2 = arr[i], arr[j]
        calc = min(h1, h2) * (j-i)
        if(max_water < calc):
            max_water = calc

        if (h1 <= h2):
            i+=1
        if (h1 >= h2):
            j-=1

    return max_water
