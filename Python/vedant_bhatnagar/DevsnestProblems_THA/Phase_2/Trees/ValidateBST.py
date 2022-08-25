prev = None

def f(root):
    if root:
        if not f(root.left):
            return False
        global prev
        if prev >= root.val:
            return False
        prev = root.val
        if not f(root.right):
            return False
        return True
    return True


def solve(root):
    # CODE HERE
    global prev
    prev = -(2<<31+1)
    return 1 if f(root) else 0