def solve(n, nums):
    # CODE HERE
    if n==1:
        return nums[0]
    
    #two pointers
    l, r = 0, n-1
    if nums[0]<nums[r]:
        return nums[0]
    
    while l<=r:
        mid = (l+r)//2

        if nums[mid]>nums[mid+1]:
            return nums[mid+1]
        if nums[mid-1]>nums[mid]:
            return nums[mid]
        if nums[0]< nums[mid]:
            l = mid+1
        else:
            r = mid-1
