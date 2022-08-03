def solve(n, nums):
    # CODE HERE
    sum = 0   
    for i in range(0,n):
        sum = sum + nums[i]
        nums[i] = sum
    return nums