def solve(intervals, n, arr):
    # CODE HERE
    kat = []
    for i in range(len(intervals)):
        if arr[1] < intervals[i][0]:
            kat.append(arr)
            return kat + intervals[i:]
        
        elif arr[0]> intervals[i][1]:
            kat.append(intervals[i])

        else:
            arr = [min(arr[0], intervals[i][0]), max(arr[1], intervals[i][1])]
        
    kat.append(arr)
    
    return kat
