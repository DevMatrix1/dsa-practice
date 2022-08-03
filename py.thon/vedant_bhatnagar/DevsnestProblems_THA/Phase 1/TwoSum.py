def solve(n, nums, target):
    # CODE HERE
    m = {}
    for i, el in enumerate(nums):
        if target - el in m:
            return (m[target-el], i)
        m[el] = i

    