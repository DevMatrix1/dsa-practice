def solve(root, p, q):
    # CODE HERE
    def f(root,p,q):
        if root:
            if p<=root.val<=q:
                return root
            if q<root.val:
                return f(root.left, p,q)
            return f(root.right, p,q)
    return f(root, min(p,q), max(p,q))