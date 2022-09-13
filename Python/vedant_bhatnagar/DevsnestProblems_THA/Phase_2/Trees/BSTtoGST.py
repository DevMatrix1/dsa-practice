sum = 0
def transformTreeUtil(root):

    # Base case
    if (root == None):
            return
    
    # Recur for right subtree
    transformTreeUtil(root.right)
    
    # Update sum
    global sum
    sum = sum + root.val
    
    # Store old sum in current node
    root.val = sum
    
    # Recur for left subtree
    transformTreeUtil(root.left)

def solve(root):
    # CODE HERE
    transformTreeUtil(root)
    return root 

