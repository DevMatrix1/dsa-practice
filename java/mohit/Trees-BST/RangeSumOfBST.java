static int sum = 0;
static int solve(TreeNode root, int low, int high)
{
    //CODE HERE
    if(root == null) return sum;

    if(low <= root.val && root.val <= high) sum += root.val;

    if(root.val > low) solve(root.left, low, high);

    if(root.val < high) solve(root.right, low, high);

    return sum;
}