def solve(n, arr):
    # CODE HERE
    kat = []
    for i in range(0,n+2):
        if i not in arr:
            kat.append(i)

    
    return kat
