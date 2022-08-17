# Approach 1(TC-> O(nlogn))

def solve(intervals, n, arr):
    intervals.append(arr)
    ans=[]
    intervals=sorted(intervals,key=lambda x:x[0]) 
    print(intervals)
    # count=0
    curr_intervals=intervals[0]
    for next_intervals in intervals[1:]:
        if curr_intervals[1]>=next_intervals[0]:
            if curr_intervals[1]<next_intervals[1]:
                curr_intervals[1]=next_intervals[1]
        else:
            ans.append(curr_intervals)
            curr_intervals=next_intervals
    ans.append(curr_intervals)
    return ans

# Approach 2(TC-> O(n))

def solve(intervals, n, arr):
    if intervals[len(intervals)-1][0] < arr[0]:
        intervals.append(arr)
    else:
        for i in range(len(intervals)):
            if intervals[i][0] > arr[0]:
                intervals.insert(i, arr)
                break
    
    current_interval = intervals[0]
    result = []

    for i in range(1, len(intervals)):
        if current_interval[1] >= intervals[i][0]:
            if current_interval[1] < intervals[i][1]:
                current_interval[1] = intervals[i][1]
        else:
            result.append(current_interval)
            current_interval = intervals[i]
    result.append(current_interval)  
    return result