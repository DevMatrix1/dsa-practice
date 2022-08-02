def solve(n, nums):
    # CODE HERE
    nums += nums
    st = [nums[-1]]
    nge = [-1]*n

    for i in range((n*2)-2,-1,-1):
        index = i%n
        while st:
            if (nums[i] >= st[-1]):
                st.pop()
            else:
                break
        if not st:
            nge[index] = -1
        else:
            nge[index] = st[-1]
        st.append(nums[i])
    return nge