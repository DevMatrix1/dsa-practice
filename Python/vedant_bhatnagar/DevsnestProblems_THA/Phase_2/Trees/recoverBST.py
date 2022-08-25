arr = []

def inorder(root):
    global arr
    if root:
        inorder(root.left)
        arr.append(root.val)
        inorder(root.right)
    return None

def solve(root):
    inorder(root)
    global arr
    m = {}
    arr1=sorted(arr)
    for i in range(0, len(arr)):
        if arr[i] != arr1[i]:
            m[arr[i]] = arr1[i]
    q = deque([root])
    while q:
        n = q.pop()
        if n:
            if n.val in m:
                n.val = m[n.val]
            if n.left:
                q.appendleft(n.left)
            if n.right:
                q.appendleft(n.right)
    return root


    