post = inomap = None

def get_tree(instart, inend, poststart,postend):
    inoindex = inomap[post[postend]]
    l = inoindex - instart
    r = inend - inoindex
    root = TreeNode(post[postend])
    root.left = get_tree(instart,inoindex-1,poststart, poststart+l-1) if l else None
    root.right = get_tree(inoindex+1, inend,poststart+l, poststart+l+r-1) if r else None
    return root


def solve(n1,inorder, n2, postorder):
    # CODE HERE
    global post, inomap
    post = postorder
    inomap = {el:i for i,el in enumerate(inorder)}
    return get_tree(0,n2-1,0,n1-1)