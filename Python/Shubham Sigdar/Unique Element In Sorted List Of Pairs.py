def solve(n, nums):
    start=0
    end=n-1
    while start<end:
        mid=(start+end)//2
        if((mid%2==1 and nums[mid-1]==nums[mid]) or (mid%2==0 and nums[mid]==nums[mid+1])):
            start=mid+1
        else:
            end=mid
    return nums[start]
