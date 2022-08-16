def solve(root, p, q):
    # CODE HERE
    def recursion(root):
        if root == None or root.val in (p,q):
            return root
    
        left_node = recursion(root.left)
        right_node = recursion(root.right)

        if left_node and right_node:
            return root
        else:
            return left_node or right_node
    
    return recursion(root)
