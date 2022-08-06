def solve(root):
    # CODE HERE
    
    kat = ans(root, [])
    sort = sorted(kat, key= lambda a:a.val)
    for i in range(len(kat)):
        if kat[i] != sort[i]:
            kat[i].val, sort[i].val = sort[i].val, kat[i].val
            return root
def ans(root, kat):
    if not root:
        return
    ans(root.left,kat)
    kat.append(root)
    ans(root.right, kat)

    return kat
