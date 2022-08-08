def f(root, sum):
    if root:
        ans = (2*sum) + root.val
        if not root.left and not root.right:
            return ans
        return f(root.left, ans) + f(root.right, ans)
    return 0

def solve(root):
    # CODE HERE
    return f(root, 0)