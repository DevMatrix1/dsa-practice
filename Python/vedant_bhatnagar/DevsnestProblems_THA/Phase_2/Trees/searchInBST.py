def solve(root, target):
    # CODE HERE
    if not root:
        return TreeNode(-1)
    ptr = root    
    while ptr != None:
        if ptr.val == target:
            return ptr
        if target > ptr.val:
            ptr = ptr.right
        else:
            ptr = ptr.left
    return TreeNode(-1)