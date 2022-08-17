// link- https://devsnest.in/algo-challenges/maximum-depth-of-binary-tree?tab=question

static int solve(TreeNode root){
//CODE HERE 
 if(root==null) return 0;

    int left=solve(root.left);
    int right=solve(root.right);

    return 1+Math.max(left,right);
}