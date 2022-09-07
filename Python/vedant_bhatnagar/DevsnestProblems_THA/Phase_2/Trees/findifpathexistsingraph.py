def create_adj(edges):
    n = 1 + max([e[1] for e in edges] + [e[0] for e in edges])
    adj_dir = [[0]*n for i in range(n)]
    for e in edges:
        adj_dir[e[0]][e[1]] = 1
        adj_dir[e[1]][e[0]] = 1
    return adj_dir  

def solve(n, edges, source, destination):
    # CODE HERE
    if n == 1:
        return 1
    vis = set()
    adj = create_adj(edges)
    n = len(adj)
    q = deque([source])
    while q:
        el=q.pop()
        # print(el, end=" ")
        for adjel in range(n):
            if adj[el][adjel] and adjel not in vis:
                if adjel == destination:
                    return 1
                vis.add(adjel)
                q.appendleft(adjel)
    return 0