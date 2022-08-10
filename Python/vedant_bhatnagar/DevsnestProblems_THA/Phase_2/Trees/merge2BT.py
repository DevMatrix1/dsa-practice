def solve(root1, root2):
    # CODE HERE
    # if  not root1:
    #     return root2
    # if not root2:
    #     return root1
    # root = TreeNode(root1.val+root2.val)
    # root.left = solve(root1.left, root2.left)
    # root.right = solve(root1.right, root2.right)
    # return root

    if  not root1:
        return root2
    if not root2:
        return root1
    root1.val = root1.val+root2.val
    root1.left = solve(root1.left, root2.left)
    root1.right = solve(root1.right, root2.right)
    return root1
    