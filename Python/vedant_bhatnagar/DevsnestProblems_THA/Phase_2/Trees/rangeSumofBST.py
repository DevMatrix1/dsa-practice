def solve(root, low, high):
    # CODE HERE
    q = deque([root])
    Sum=0
    while q:
        n = q.pop()
        if n.val >= low and n.val<=high:
            Sum+=n.val
        if n.left:
            q.appendleft(n.left)
        if n.right:
            q.appendleft(n.right)
    return Sum