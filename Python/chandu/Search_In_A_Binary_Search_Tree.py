def solve(root, target):
    # CODE HERE
    if not root:
        return TreeNode(-1)
    
    if root.val == target:
        return root
    
    return solve(root.left,target) if root.val>target else solve(root.right, target)
    
