static int solve(TreeNode node){
    //CODE HERE 
    int[] res = new int[1];
    findDiameter(node,res);
    return res[0];
    }
    static int findDiameter(TreeNode root, int[] ar){
     if(root==null)
        return 0;
    int leftHeight = findDiameter(root.left,ar);
    int rightHeight = findDiameter(root.right,ar);
    ar[0] = Math.max(ar[0],leftHeight+rightHeight);
    return 1 + Math.max(leftHeight,rightHeight);
    }