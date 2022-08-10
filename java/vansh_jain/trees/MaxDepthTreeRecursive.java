static int solve(TreeNode root){
    //CODE HERE 
    if(root==null)
    return 0;
    return 1+Math.max(solve(root.left),solve(root.right));
    }