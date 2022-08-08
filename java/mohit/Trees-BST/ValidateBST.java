static int minimum = Integer.MIN_VALUE;
static int solve(TreeNode root)
{
    //CODE HERE
    if(isBST(root)) return 1;
    else return 0;
}

static boolean isBST(TreeNode root)
{
    if(root == null) return true;

    if(!isBST(root.left)) return false;
    
    if(minimum < root.val) minimum = root.val;
    else return false;

    if(!isBST(root.right)) return false;

    return true;
}