def solve(root):
    # CODE HERE
    kat = level_order(root)
    a, b = False, False
    for tup in kat:
        arr, idx = tup
        if idx%2 == 0:
            for x in arr:
                if odd_fxn(x):
                    a = True
                else:
                    a = False
                    break
            
            if increasing(arr) and a:
                b = True
            else:
                return int(False)
        
        else:
            for x in arr:
                if even_fxn(x):
                    a = True
                else:
                    a = False
                    break
            if decreasing(arr) and a:
                b = True
            else:
                return int(False)
    return int(b) 

def odd_fxn(x):
    if x%2 == 0:
        return False
    return True

def even_fxn(x):
    if x%2 == 0:
        return True
    else:
        return False

def increasing(arr):
    for i in range(1, len(arr)):
        if arr[i-1]>=arr[i]:
            return False
    return True

def decreasing(arr):
    for i in range(1, len(arr)):
        if arr[i-1] <= arr[i]:
            return False
    return True

def level_order(root):
    if not root:
        return []
    pq = deque([root])
    kat = []
    count = 0
    while pq:
        l = len(pq)
        rit = []
        for i in range(l):
            node = pq.popleft()
            rit.append(node.val)

            if node.left:
                pq.append(node.left)
            if node.right:
                pq.append(node.right)
        kat.append((rit, count))
        count += 1
    return kat
