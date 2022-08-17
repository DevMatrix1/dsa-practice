def solve(root):
    # CODE HERE
    if root is None:
        return []
    kat = [root.val]

    def leftNode(node):
        if not node or not node.left and not node.right:
            return
        kat.append(node.val)
        if node.left:
            leftNode(node.left)
        else:
            leftNode(node.right)
    
    def leafNode(node):
        if not node:
            return 
        if not node.left and not node.right:
            kat.append(node.val)
        
        leafNode(node.left)
        leafNode(node.right)
    
    def rightNode(node):
        if not node or not node.left and not node.right:
            return
        
        if node.right:
            rightNode(node.right)
        else:
            rightNode(node.left)
        
        kat.append(node.val)

    leftNode(root.left)
    leafNode(root)
    rightNode(root.right)
    return kat
