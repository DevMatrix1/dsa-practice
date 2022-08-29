def solve(root, k):
    # CODE HERE
    arr=[]
    def f(root):
        if root:
            f(root.left)
            arr.append(root.val)
            f(root.right)
    f(root)
    return arr[k-1]

####################################

i = 0
n = 0

def solve(root, k):
    
    global i,n
    if root:
        solve(root.left,k)
        i+=1
        if i==k:
            n = root.val
        solve(root.right, k)
    return n