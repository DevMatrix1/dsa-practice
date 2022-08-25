maxsum = 0
inf, ninf = 10**5, -10**5

def f(root):
    if not root:
        return inf, ninf, 0
    lmin, lmax, lsum = f(root.left)
    rmin, rmax, rsum = f(root.right)

    if lmax < root.val <rmin:
        global maxsum
        maxsum = max(maxsum, lsum+rsum+root.val)
        return min(lmin, root.val), max(rmax, root.val), lsum+rsum+root.val
    return ninf, inf, 0

def solve(root):
    # CODE HERE
    f(root)
    return maxsum