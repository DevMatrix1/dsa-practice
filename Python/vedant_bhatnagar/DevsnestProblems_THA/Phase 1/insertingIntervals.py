def solve(intervals, n, arr):
    # CODE HERE
    n = len(intervals)
    for i in range(0,n-1):
        if arr[0]>intervals[i][0] and arr[0]<intervals[i+1][0]:
            intervals = intervals[0:i+1] + [arr] + intervals[i+1:]
            break
        elif arr[0]<intervals[i][0]:
            intervals = [arr]+intervals
    # print(intervals)
    ans = []
    curr_interval = intervals[0]
    

    for next_interval in intervals[1:]:
        if curr_interval[1] >= next_interval[0]:
            if curr_interval[1] < next_interval[1]:
                curr_interval[1] = next_interval[1]
        else:
            ans.append(curr_interval)
            curr_interval = next_interval
    ans.append(curr_interval)

    return ans