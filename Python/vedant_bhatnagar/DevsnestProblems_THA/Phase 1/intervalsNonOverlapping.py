def solve(ranges):
    # CODE HERE
    ranges = sorted(ranges,key = lambda x: x[0])
    size = len(ranges)
    rem = 0
    end = ranges[0][1]
    for i in range(1, size):
        if (ranges[i][0] < end):
            rem += 1
            end = min(ranges[i][1], end)             
        else:
            end = ranges[i][1] 
    return rem