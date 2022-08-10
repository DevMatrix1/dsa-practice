class TreeNode:
  def __init__(self,val,left=None,right=None):
    self.val = val
    self.left = left
    self.right = right

root = TreeNode(10, TreeNode(12, None, TreeNode(7)), TreeNode(14, None, TreeNode(19)))

#function for right view (preorder - NLR)
def f(root,level,m):
    if root:
        m[level] = root.val
        f(root.left, level+1,m)
        f(root.right, level+1,m)

#function for left view (inverted preorder - NRL)
# def f(root,level,m):
#     if root:
#         m[level] = root.val
#         f(root.right, level+1,m)
#         f(root.left, level+1,m)

def solve(root):
    # CODE HERE
    m = {}
    f(root, 0, m)
    # return m.values()
    return [m[x] for x in range(len(m))]

print(solve(root))