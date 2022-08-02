def solve(n, nums):
    # CODE HERE
    curr = n-2

    while(curr>-1):
        if nums[curr] > nums[curr+1]:
            curr = curr-1
        else:
            break
    
    if curr == -1:
        i = 0
        j = n-1
        while(i<=j):
            nums[i], nums[j] = nums[j], nums[i]
            i = i+1
            j = j-1
        return nums

    if curr > -1:
        for i in range(n-1, curr, -1):
            if nums[i] > nums[curr]:
                nums[i], nums[curr] = nums[curr], nums[i]
                break

        i=curr+1
        j=n-1
        while(i<=j):
            nums[i], nums[j] = nums[j], nums[i]
            i=i+1
            j=j-1
        return nums