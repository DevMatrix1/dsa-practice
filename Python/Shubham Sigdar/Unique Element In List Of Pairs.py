def solve(n, nums):
    for i in range(n):
        if nums.count(nums[i])!=2:
            return nums[i]