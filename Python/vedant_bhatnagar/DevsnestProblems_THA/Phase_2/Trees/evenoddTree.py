def solve(root):
    # CODE HERE
    q = deque([root,None])
    prevel = 0
    even = True
    while len(q) > 1:
        el = q.popleft()
        if el:
            if even:
                if el.val > prevel and el.val%2:
                    prevel = el.val
                else: 
                    return 0
            else:
                if el.val < prevel and not el.val%2:
                    prevel = el.val
                else: 
                    return 0
            if el.left:
                q.append(el.left)
            if el.right:
                q.append(el.right)
        else:
            even = not even
            if even:
                prevel = 0
            else:
                prevel = 10000000
            q.append(None)    
    return 1