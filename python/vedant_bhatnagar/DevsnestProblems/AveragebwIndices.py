def solve(n, arr, x, y):
    sum1, cnt = 0,0
    for i in arr[x:y+1]:
        cnt+=1
        sum1+=i
    return sum1/cnt