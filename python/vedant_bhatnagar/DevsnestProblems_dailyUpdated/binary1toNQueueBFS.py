def solve(n):
    # CODE HERE
    ans = []
    binq = deque()
    binq.appendleft("1")
    for i in range(1,n+1):
        el = binq.pop()
        binq.appendleft(el+"0")
        binq.appendleft(el+"1")
        ans.append(el)
    return ans