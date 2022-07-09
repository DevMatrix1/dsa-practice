def solve(intervals):
    # CODE HERE
    intervals = sorted(intervals,key = lambda x: x[0])
    ans = []
    curr_interval = intervals[0]
    n = len(intervals)

    for next_interval in intervals[1:n]:
        if curr_interval[1] >= next_interval[0]:
            if curr_interval[1] < next_interval[1]:
                curr_interval[1] = next_interval[1]
        else:
            ans.append(curr_interval)
            curr_interval = next_interval
    ans.append(curr_interval)

    return ans

