// link- https://devsnest.in/algo-challenges/max-sum-bst?tab=question

static int ans;
static class isBSTNode {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    boolean isBST = true;
    int sum = 0;
}

    static int sum = 0;
    
    static isBSTNode isBST(TreeNode root) {
        if(root == null) return new isBSTNode();
        
        isBSTNode left = isBST(root.left);
        isBSTNode right = isBST(root.right);
        
        isBSTNode cNode = new isBSTNode();
        
        cNode.sum = root.val + left.sum + right.sum;
       
        
        if(left.isBST && right.isBST && root.val < right.min && root.val > left.max) {
            
            sum = Math.max(sum, cNode.sum);

        } else {
            cNode.isBST = false;
        }
        
        cNode.min = Math.min(root.val, Math.min(left.min, right.min));
        cNode.max = Math.max(root.val, Math.max(left.max, right.max));
        
        return cNode;
    }
    
static int solve(TreeNode root){
//CODE HERE 
    isBST(root);
    return sum;
  
}