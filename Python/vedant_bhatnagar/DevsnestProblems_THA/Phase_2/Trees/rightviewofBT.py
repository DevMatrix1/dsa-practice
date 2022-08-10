def f(root,level,m):
    if root:
        m[level] = root.val
        f(root.left, level+1,m)
        f(root.right, level+1,m)
        
def solve(root):
    # CODE HERE
    m = {}
    f(root, 0, m)
    # return m.values()
    return [m[x] for x in range(len(m))]