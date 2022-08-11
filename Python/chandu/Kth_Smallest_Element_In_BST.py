def solve(root, k):
    # CODE HERE
    # using inorder transversal
    kat = []
    def inorder(root):
        if not root:
            return []
        inorder(root.left)
        kat.append(root.val)
        inorder(root.right)

        return kat
    
    return inorder(root)[k-1]
