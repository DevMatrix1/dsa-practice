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

    boolean left = isBST(root.left);

    if(minimum < root.val) minimum = root.val;
    else return false;

    boolean right = isBST(root.right);

    if(left && right) return true;
    else return false;
}