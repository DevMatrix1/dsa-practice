static int counter = 0;
static int ans = 0;
static int solve(TreeNode root, int k)
{
    if (root==null) return 0;
    
    solve(root.left, k);

    counter ++;
    if(counter == k)    ans = root.val;

    if(counter < k) solve(root.right, k);

    return ans;
}