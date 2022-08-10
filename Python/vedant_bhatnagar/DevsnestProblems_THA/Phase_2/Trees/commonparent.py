def solve(root, p, q):
    # CODE HERE
    if root:
        if root.val == p or root.val==q:
            return root
        l,r = solve(root.left,p,q), solve(root.right,p,q)
        if l and r:
            return root
        return l if l else r
    return None