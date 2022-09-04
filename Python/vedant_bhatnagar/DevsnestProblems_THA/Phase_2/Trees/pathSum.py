def solve(root, targetSum):
    ans = 0
    subSum = targetSum - root.val
 
    # If we reach a leaf node and sum becomes 0, then
    # return True
    if(subSum == 0 and root.left == None and root.right == None):
        return 1
 
    # Otherwise check both subtrees
    if root.left is not None:
        ans = ans or solve(root.left, subSum)
    if root.right is not None:
        ans = ans or solve(root.right, subSum)
 
    return ans