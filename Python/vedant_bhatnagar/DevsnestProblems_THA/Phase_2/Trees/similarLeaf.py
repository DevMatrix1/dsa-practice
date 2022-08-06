def findleaf(root):
    ans = []
    st = [root]
    while st:
        n = st.pop()
        if n.left:
            st.append(n.left)
        if n.right:
            st.append(n.right)
        if not n.left and not n.right:
            ans.append(n.val)
    return ans
        
def solve(root1, root2):
    # CODE HERE
    ans1 = findleaf(root1)
    # print(ans1)
    ans2 = findleaf(root2)
    # print(ans2)
    return 1 if ans1==ans2 else 0



#Kshitiz's approach

def f(root,ans):
    if root:
        if not root.left and not root.right:
            ans.append(root.val)
        f(root.left,ans)
        f(root.right,ans)

def solve(root1, root2):
    # # CODE HERE
    # ans1 = findleaf(root1)
    # # print(ans1)
    # ans2 = findleaf(root2)
    # # print(ans2)
    # return 1 if ans1==ans2 else 0
    ans = []
    ans2 = []
    f(root1,ans)
    f(root2,ans2)
    return 1 if ans==ans2 else 0