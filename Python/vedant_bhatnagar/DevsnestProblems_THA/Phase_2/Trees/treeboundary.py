


def solve(root):
    # CODE HERE
    ans = []
    def printLeaves(root):
        if(root):
            printLeaves(root.left)
            
            # Print it if it is a leaf node
            if root.left is None and root.right is None:
            
                ans.append(root.val)
    
            printLeaves(root.right)
 
# A function to print all left boundary nodes, except a
# leaf node. Print the nodes in TOP DOWN manner
    def printBoundaryLeft(root):
        
        if(root):
            if (root.left):
                
                # to ensure top down order, print the node
                # before calling itself for left subtree
            
                ans.append(root.val)
                printBoundaryLeft(root.left)
            
            elif(root.right):
            
                ans.append(root.val)
                printBoundaryLeft(root.right)
         
        # do nothing if it is a leaf node, this way we
        # avoid duplicates in output
 
 
# A function to print all right boundary nodes, except
# a leaf node. Print the nodes in BOTTOM UP manner
    def printBoundaryRight(root):
        
        if(root):
            if (root.right):
                # to ensure bottom up order, first call for
                # right subtree, then print this node
                printBoundaryRight(root.right)
            
                ans.append(root.val)
            
            elif(root.left):
                printBoundaryRight(root.left)
                
                ans.append(root.val)
 
        # do nothing if it is a leaf node, this way we
        # avoid duplicates in output
 
 
# A function to do boundary traversal of a given binary tree
    def printBoundary(root):
        if (root):
            
            ans.append(root.val)
            
            # Print the left boundary in top-down manner
            printBoundaryLeft(root.left)
    
            # Print all leaf nodes
            printLeaves(root.left)
            printLeaves(root.right)
    
            # Print the right boundary in bottom-up manner
            printBoundaryRight(root.right)
    printBoundary(root)
    return ans