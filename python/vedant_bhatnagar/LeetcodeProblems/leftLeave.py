from Tree import TreeNode,print_tree
from array_to_levelorderTree import constructTreeLevelOrder

def leftLeaveSum(root,isleft=False,s=0):
    if root:
        if not root.left and not root.right and isleft:
            s+=root.val
        s= leftLeaveSum(root.left,True,s)
        s = leftLeaveSum(root.right,False,s)
    return s 

def main():
    arr = [1,2,5,8,9,2]
    root = constructTreeLevelOrder(arr,0,len(arr))
    print_tree(root)
    print(leftLeaveSum(root))

    
if __name__=="__main__":
    main()
