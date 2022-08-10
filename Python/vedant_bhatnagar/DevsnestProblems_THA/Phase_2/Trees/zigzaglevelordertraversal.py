def solve(root):
    # CODE HERE
    q = deque([None, root])
    ans = [[root.val]]
    a = []
    ltor = False
    while q:
        n = q.pop()
        if n:
            if n.left:
                q.appendleft(n.left)
                a.append(n.left.val)
            if n.right:
                q.appendleft(n.right)
                a.append(n.right.val)
        else:
            if q:
                q.appendleft(None)
            if ltor:
                ans.append(a)
            else:
                ans.append(a[::-1])
            ltor = not ltor
            a = []
    return ans