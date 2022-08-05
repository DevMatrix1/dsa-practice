def solve(root):
    # CODE HERE
    if root:
        solve(root.left)
        solve(root.right)
        root.left, root.right = root.right,root.left
    return root