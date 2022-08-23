def solve(n, arr):
    num=sorted(arr)
    nums=[]
    for i in range(n+2):
        if i not in num:
            nums.append(i)
    return nums