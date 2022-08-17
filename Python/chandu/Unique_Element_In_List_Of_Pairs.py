def solve(n, nums):
    # CODE HERE
    # xor
    kat = nums[0]
    for i in range(1, n):
        kat = kat^nums[i]
    
    return kat
