def solve(interval):
    interval=sorted(interval,key=lambda x:x[0])
    count=0
    curr_intervals=interval[0]
    for next_intervals in interval[1:]:
        if curr_intervals[1]<=next_intervals[0]:
            curr_intervals[1]=next_intervals[1]
        else:
            count+=1
            curr_intervals[1]=min(next_intervals[1],curr_intervals[1])
    return count