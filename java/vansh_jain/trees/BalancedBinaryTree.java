static int solve(TreeNode node){
    //CODE HERE 
    if(isBalancedTree(node)!=0)
        return 1;
    else
        return 0;
    }
    static int isBalancedTree(TreeNode root){
     if(root==null)
        return 0;
    int leftHeight = isBalancedTree(root.left);
    int rightHeight = isBalancedTree(root.right);
    if(Math.abs(leftHeight-rightHeight)>1)
        return 0;
    return 1 + Math.max(leftHeight,rightHeight);
    }