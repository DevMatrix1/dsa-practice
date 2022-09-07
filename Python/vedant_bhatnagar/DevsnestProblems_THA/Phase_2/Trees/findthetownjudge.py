def solve(n, trust):
    # CODE HERE
    s = set()
    for i in trust:
        s.add(i[0])
    
    for i in range(1,n+1):
        if i not in s:
            return i
    return -1
