static int solve(TreeNode root){
    //CODE HERE 
    if (root == null)
        return 0;
    if(root.left != null && root.left.left==null && root.left.right==null)
        return root.left.val + solve(root.right);
    return solve(root.left)+solve(root.right);
    
}
