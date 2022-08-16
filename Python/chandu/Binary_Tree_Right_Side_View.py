def solve(root):
    # CODE HERE
    if not root:
        return []
    pq = deque([root])
    kat = []

    while pq:
        l = len(pq)
        kat.append(pq[-1].val)
        for i in range(l):
            node = pq.popleft()
            if node.left:
                pq.append(node.left)
            if node.right:
                pq.append(node.right)
    return kat
