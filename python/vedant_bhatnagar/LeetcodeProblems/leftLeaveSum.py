# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumOfLeftLeaves(self, root: Optional[TreeNode],isleft=False,s=0) -> int:
        if root:
            if not root.left and not root.right and isleft:
                s+=root.val
            s= self.sumOfLeftLeaves(root.left,True,s)
            s = self.sumOfLeftLeaves(root.right,False,s)
        return s 
