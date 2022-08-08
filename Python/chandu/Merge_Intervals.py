def solve(intervals):
    # CODE HERE
    # sorting according to start time
    intervals.sort(key = lambda x: x[0])
    kat = []
    for inter in intervals:

        if not kat or kat[-1][1] < inter[0]:
            kat.append(inter)
        
        else:
            kat[-1][1] = max(kat[-1][1], inter[1])
        
    return kat
