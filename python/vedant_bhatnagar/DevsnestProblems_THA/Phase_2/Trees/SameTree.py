def solve(p, q):
    # CODE HERE
    if (p and not q) or (q and not p):
        return 0
    if not p and not q:
        return 1
    else:
        return 1 if p.val == q.val and solve(p.left,q.left) and solve(p.right,q.right) else 0
