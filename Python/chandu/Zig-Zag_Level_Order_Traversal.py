def solve(root):
    # CODE HERE
    # bfs
    if not root:
        return []
    
    pq = deque([root])
    kat = []
    switch = False

    while pq:
        temp = []
        l = len(pq)
        for i in range(l):
            node = pq.popleft()
            temp.append(node.val)

            if node.left:
                pq.append(node.left)
            if node.right:
                pq.append(node.right)
            
        if switch:
            temp.reverse()
        kat.append(temp)
        switch = not switch
    return kat
