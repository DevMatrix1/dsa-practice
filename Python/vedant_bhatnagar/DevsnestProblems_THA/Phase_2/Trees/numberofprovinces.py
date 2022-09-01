def solve(isConnected):
    # CODE HERE
    noofprovinces=0
    vis = set()
    n = len(isConnected)
    for i in range(n):
        if i in vis:
            continue
        noofprovinces+=1
        vis.add(i)
        q = deque([i])
        while q:
            el=q.pop()
            # print(el, end=" ")
            for adjel in range(n):
                if isConnected[el][adjel] and adjel not in vis:
                    vis.add(adjel)
                    q.appendleft(adjel)
    return noofprovinces
