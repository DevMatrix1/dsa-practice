def solve(n, nums):
    # CODE HERE
    tracker = {}
    for i in nums:
        if i in tracker:
            tracker[i] += 1
        else:
            tracker[i] = 1
    
    for i in tracker:
        if tracker[i] == 1:
            return i