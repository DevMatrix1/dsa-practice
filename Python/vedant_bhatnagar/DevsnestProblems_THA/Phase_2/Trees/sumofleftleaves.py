def solve(root):
    # CODE HERE
    q = deque([None, root])
    if not root or (not root.left and not root.right):
        return 0
    sum = 0
    while q:
        n = q.pop()
        if n:
            if n.left:
                q.appendleft(n.left)
            if n.right:
                q.appendleft(n.right)
            if n.left and n.left.left == None and n.left.right == None:
                sum += n.left.val
        else:
            if q:
                q.appendleft(None)
            else:
                break
    return sum