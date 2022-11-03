# Q:https://practice.geeksforgeeks.org/problems/preorder-traversal/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=preorder-traversal

def preorder(root):
    ans = []
    if root is None:
        return ans
    ans.append(root.data)
    ans += preorder(root.left)
    ans += preorder(root.right)
    return ans
