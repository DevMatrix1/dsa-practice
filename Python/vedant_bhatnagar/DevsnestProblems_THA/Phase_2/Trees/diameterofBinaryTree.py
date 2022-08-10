def f(root):
    if root:
        ld,lp = f(root.left)
        rd, rp = f(root.right)
        return 1+max(ld,rd), max(lp,rp,1+ld+rd)
    return 0,0

def solve(root):
    # CODE HERE
    return f(root)[1] - 1