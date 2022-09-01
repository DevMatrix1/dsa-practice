def solve(numCourses, prerequisites):
    # CODE HERE
    ans = []
    in_deg = [0]*numCourses
    # print(indeg)
    adjlist = [[] for i in range(numCourses)]
    for i in prerequisites:
        in_deg[i[0]] += 1
        adjlist[i[1]].append(i[0])
    
    # print(indeg, adjlist)
    q = deque()
    for i in range(0, len(in_deg)):
        if in_deg[i]==0:
            q.appendleft(i)
    while q:
        el = q.pop()
        ans.append(el)
        for i in adjlist[el]:
            in_deg[i] -= 1
            if in_deg[i] == 0:
                q.appendleft(i)
    return 1 if len(ans)==numCourses else 0