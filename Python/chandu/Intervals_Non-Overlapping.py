def solve(interval):
    # CODE HERE
    interval.sort(key = lambda x :x[1])
    print(interval)
    count = 1
    start, end  = interval[0]
    for s,e in interval:
        if s<end:
            continue
        else:
            start, end = s,e
            count += 1
    
    return len(interval) - count
