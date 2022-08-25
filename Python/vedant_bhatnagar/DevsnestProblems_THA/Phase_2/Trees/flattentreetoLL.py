arr=[]

def inorder(root):
    global arr
    if root:
        arr.append(root.val)
        inorder(root.left)
        inorder(root.right)

def solve(root):
    # CODE HERE
    inorder(root)
    if not root:
        return None
    global arr
    a = temp = TreeNode(arr[0])
    for i in arr[1:]:
        temp.right = TreeNode(i)
        temp=temp.right
    return a
    