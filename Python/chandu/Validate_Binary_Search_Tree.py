def solve(root):
    # CODE HERE
    return VBST(root, float("-inf"), float("inf"))
def VBST(node, left, right):
    if not node:
        return 1
    if not (node.val>left and node.val<right):
        return 0
    
    return VBST(node.left, left, node.val) and VBST(node.right, node.val, right)
    
