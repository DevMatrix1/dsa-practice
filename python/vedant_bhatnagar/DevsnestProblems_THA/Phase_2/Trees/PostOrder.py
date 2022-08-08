def solve(root,arr=[]):
    # CODE HERE
    if root:
        solve(root.left)
        solve(root.right)
        arr.append(root.val)
    return arr