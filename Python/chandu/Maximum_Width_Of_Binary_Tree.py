def solve(root):
    # CODE HERE
    # level order transversal
    pq = deque([(root, 0)])
    kat = 0 # max width

    while pq:
        l = len(pq)
        s = pq[0][1]
        e = pq[-1][1]
        kat = max(kat,e-s+1)
        for i in range(l):
            node , pos = pq.popleft()
            # controlling overflow
            pos = pos - s
            if node.left:
                pq.append((node.left, 2*pos+1))
            
            if node.right:
                pq.append((node.right, 2*pos + 2))
    return kat
