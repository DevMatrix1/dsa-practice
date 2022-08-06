def solve(root):
    # CODE HERE
    kat = ans(root, [])
    res = t1 = TreeNode(-1)
    for i in range(len(kat)):
        if i< len(kat)-1:
            t1.val = kat[i]
            t1.right = TreeNode(-1)
            t1 = t1.right
        else:
            t1.val = kat[i]
    return res

def ans(root, kat):
    if root:
        ans(root.left,kat)
        kat.append(root.val)
        ans(root.right,kat)
    return kat
