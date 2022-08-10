def solve(n1, n2, preorder, inorder):
    # CODE HERE
    if len(preorder)==0 or len(inorder)==0:
        return None
    
    root_v = preorder.pop(0)
    root_i = inorder.index(root_v)
    root = TreeNode(root_v)
    root.left = solve(n1-1,root_i, preorder, inorder[:root_i])
    root.right = solve(n2-1, root_i, preorder, inorder[root_i+1:])

    return root
