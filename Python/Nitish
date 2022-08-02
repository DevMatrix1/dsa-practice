# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def widthOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        maxw = 0
        q = deque([(root,0),None])
        st = []
        while q:
            x = q.popleft()

            if x:
                node = x[0]
                pos = x[1]
                st.append(pos)
                if node.left:
                    q.append((node.left,pos*2+1))
                if node.right:
                    q.append((node.right,pos*2+2))


            else:
                maxw = max(maxw,st[-1]-st[0]+1)
                st = []
                if q:
                    q.append(None)



        return maxw 
