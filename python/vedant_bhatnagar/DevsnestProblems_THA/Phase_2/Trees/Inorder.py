def solve(root,arr=[]):
    # CODE HERE
    if root:
        solve(root.left)
        arr.append(root.val)
        solve(root.right)
    return arr