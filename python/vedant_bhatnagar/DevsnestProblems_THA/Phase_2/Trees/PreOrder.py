def solve(root,arr=[]):
    # CODE HERE
    if root:
        arr.append(root.val)
        solve(root.left)
        solve(root.right)
    return arr