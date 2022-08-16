def solve(root, p, q):
    # CODE HERE
    return recursion(root)
def recursion(root):
    if root== None or root.val==p or root.val == q:
        return root
    
    left_node = recursion(root.left)
    right_node = recursion(root.right)

    if left_node and right_node:
        return root
    else:
        return left_node or right_node
