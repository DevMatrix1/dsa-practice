def f(p,q):
    if (p and not q) or (q and not p):
        return 0
    if not p and not q:
        return 1
    else:
        return 1 if p.val == q.val and f(p.left, q.right) and f(p.right, q.left) else 0


def solve(root):
    # CODE HERE
    if root:
        return f(root.left, root.right)
