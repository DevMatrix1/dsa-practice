pre = inomap = None

def get_tree(prestart, preend, instart,inend):
    inoindex = inomap[pre[prestart]]
    l = inoindex - instart
    r = inend - inoindex
    root = TreeNode(pre[prestart])
    root.left = get_tree(prestart+1, prestart+l, instart,inoindex-1) if l else None
    root.right = get_tree(prestart+l+1, preend, inoindex+1, inend) if r else None
    return root


def solve(n1, n2, preorder, inorder):
    # CODE HERE
    global pre, inomap
    pre = preorder
    inomap = {el:i for i,el in enumerate(inorder)}
    return get_tree(0,n1-1,0,n2-1)