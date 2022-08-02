# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int,cursum=0,issum=False) -> bool:
        if root:
        
            if (cursum+root.val) == targetSum and not root.left and not root.right:
                issum = True
        
            issum = self.hasPathSum(root.left,targetSum,root.val+cursum,issum)
            issum = self.hasPathSum(root.right,targetSum,root.val+cursum,issum)
        
        return issum



        
