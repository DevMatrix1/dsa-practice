def depth(root, curr):
    if root:
        curr+=1
        if not root.left and not root.right:
            return curr
        return max(depth(root.left,curr),depth(root.right,curr)) 
    return curr
    
def solve(root):
    # CODE HERE
    return depth(root, 0)