def solve(intervals):
    intervals=sorted(intervals,key=lambda x:x[0])
    ans=[]
    cur_intervals=intervals[0]
    for next_intervals in intervals[1:]:
        if cur_intervals[1]>=next_intervals[0]:
            if cur_intervals[1]<=next_intervals[1]:
                cur_intervals[1]=next_intervals[1]
        else:
            ans.append(cur_intervals)
            cur_intervals=next_intervals
    ans.append(cur_intervals)
    return ans
            