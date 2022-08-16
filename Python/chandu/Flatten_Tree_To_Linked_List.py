def solve(root):
    # CODE HERE
    flat(root)
    return root

def flat(root):
    if not root:
        return root

    lefttail = flat(root.left)
    righttail = flat(root.right)

    if not lefttail and not righttail:
        return root
    elif not lefttail:
        return righttail
    elif not righttail:
        left = root.left
        root.left = None
        root.right = left
        return lefttail
    else:
        left =  root.left
        right = root.right
        root.left = None
        root.right = left
        lefttail.right = right

    return righttail
