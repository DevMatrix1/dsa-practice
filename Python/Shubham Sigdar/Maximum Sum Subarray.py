def solve(n, arr):
    cur_sum=0
    max=-10^5
    for element in arr:
        cur_sum+=element
        if max<cur_sum:
            max=cur_sum
        if cur_sum<0:
            cur_sum=0
    return max 
