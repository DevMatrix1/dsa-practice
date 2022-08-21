static int solve(TreeNode root){
    //CODE HERE 
    if(isSymmetric(root.left,root.right))
    return 1;
    return 0;
    }
    
static boolean isSymmetric(TreeNode left, TreeNode right){

    if(left==null || right==null)
        return left==right;
    return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);

}