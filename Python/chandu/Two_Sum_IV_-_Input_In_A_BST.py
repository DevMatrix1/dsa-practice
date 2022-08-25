def solve(root, k):
    def ans(root, kat):
        if not root:
            return 
        ans(root.left, kat)
        kat.append(root.val)
        ans(root.right, kat)

        return kat
    # CODE HERE
    kat = ans(root, [])
    for i in range(len(kat)):
        if k - kat[i] in (kat[:i]+ kat[i+1:]):
            return 1
    
    return 0
