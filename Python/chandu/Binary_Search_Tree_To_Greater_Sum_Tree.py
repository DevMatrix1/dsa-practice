def solve(root):
    # CODE HERE

    def ans(root, temp):
        if root.right:
            temp = ans(root.right, temp)
        root.val += temp
        if root.left:
            return ans(root.left, root.val)
        
        return root.val
    ans(root, 0)
    return root
