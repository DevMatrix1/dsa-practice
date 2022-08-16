def solve(n1, inorder, n2, postorder):
    # CODE 
    return ans(inorder, postorder)

def ans(inorder, postorder):
    if len(inorder)==0 or postorder==0:
        return None
    
    root = TreeNode(postorder[-1])
    mid_node = inorder.index(root.val)
    p_end = postorder.index(root.val)

    root.left = ans(inorder[:mid_node], postorder[:mid_node])
    root.right = ans(inorder[mid_node + 1:], postorder[mid_node:p_end])
    return root
