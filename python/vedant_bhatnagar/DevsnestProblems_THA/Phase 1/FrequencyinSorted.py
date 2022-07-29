def solve(n, nums, k):
    # CODE HERE
    #left most index
    low = 0
    high = len(nums) - 1
    left = right = 0
    count=0

    while(low<=high):
        mid = (low+high)//2
        if(k == nums[mid]):
            left = mid
            count+=1
        if(k <= nums[mid]):
            high = mid-1
        else:
            low = mid+1
    
    #right most element
    low = 0
    high = len(nums) - 1

    while(low<=high):
        mid = (low+high)//2
        if(k == nums[mid]):
            right = mid
            count+=1
        if(k >= nums[mid]):
            low=mid+1
        else:
            high=mid-1


    if(count == 0):
        return 0
    else:
        return right-left+1
