static TreeNode solve(TreeNode root, int target)
{
    //CODE HERE
    if(root == null) return new TreeNode(-1);
    if(root. val == target) return root;
    if(target < root.val) return solve(root.left, target);
    else return solve(root.right, targer);
}