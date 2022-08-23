def solve(root):
    q = deque([None,root])
    if root==None:
        return 0
    if not root.left and not root.right:
        return 1
    maxwidth=currmax = 1
    ans = [[0]]
    temp = []
    level = 0
    idx = 0
    while q:
        n = q.pop()
        if n:
            if n.left:
                q.appendleft(n.left)
                temp.append(2*ans[level][idx] + 1)
            if n.right:
                q.appendleft(n.right)
                temp.append(2*ans[level][idx] + 2)
            idx+=1
        else:
            if q:
                q.appendleft(None)
                idx = 0
                level += 1
                ans.append(temp)
                temp = []
            else:
                break
    ans = ans[1:]
    # print(ans)
    for i in ans:
        maxwidth = max(maxwidth, i[-1] - i[0] + 1)
    return maxwidth
        

