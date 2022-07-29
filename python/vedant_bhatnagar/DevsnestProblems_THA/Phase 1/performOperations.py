def solve(n, arr):
    # CODE HERE
    # print(arr)
    x = 0
    for i in range(0, len(arr)):
        if arr[i] == "X++" or arr[i] == "++X":
            x = x+1
            # print(n)
            continue
        if arr[i] == "X--" or arr[i] == "--X":
            x = x-1
            # print(n)
    return x
