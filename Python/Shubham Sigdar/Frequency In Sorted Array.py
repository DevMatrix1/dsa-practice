def bs(nums,k):
    start=0
    end=len(nums)-1
    while start<=end:
        mid=(start+end)//2
        if k==nums[mid]:
            return mid
        elif k>nums[mid]:
            start=mid+1
        else:
            end=mid-1
    return -1
def solve(n, nums, k):
    idx=bs(nums,k)
    if idx==-1:
        return 0
    return 1 + solve(n,nums[idx+1:],k) + solve(n,nums[:idx],k)