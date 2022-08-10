def solve(root):
    # CODE HERE
    ans = 0
    pq = [(root, 0,0)]

    while pq:
        node, left, right = pq.pop()
        ans = max(left, right, ans)
        if node.left:
            pq.append((node.left,right+1, 0))
        if node.right:
            pq.append((node.right, 0, left+1))
        
    return ans
