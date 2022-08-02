# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalancedBinaryTree(self,root,isbal=True):
        if root:
            l ,isbal = self.isBalancedBinaryTree(root.left,isbal)
            r ,isbal = self.isBalancedBinaryTree(root.right,isbal)

            if r-l not in {-1,0,1}:
                isbal = False 

            return max(l,r)+1,isbal


        return -1,isbal

    def isBalanced(self, root: Optional[TreeNode]) -> bool:
         return self.isBalancedBinaryTree(root)[1]
        
