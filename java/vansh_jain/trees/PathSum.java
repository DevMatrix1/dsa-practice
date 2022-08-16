static int solve(TreeNode root, int targetSum){
    //CODE HERE 
        if(pathSum(root,targetSum))
            return 1;
        return 0;
    
    
    }
    
    static boolean pathSum(TreeNode node, int sum){
        if(sum==0)
            return true;
        if(node==null)
            return false;
        return pathSum(node.left,sum-node.val) || pathSum(node.right, sum-node.val);
    }