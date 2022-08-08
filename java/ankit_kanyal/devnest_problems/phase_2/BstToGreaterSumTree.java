// link- https://devsnest.in/algo-challenges/binary-search-tree-to-greater-sum-tree?tab=question

static int reversedSum=0;

static TreeNode solve(TreeNode root){
    dfs(root);
    return root;
}

static void dfs(TreeNode root){
   if(root!=null){
       dfs(root.right);
       
       int sum=root.val;
       root.val += reversedSum;
       reversedSum  += sum;
       
       dfs(root.left);
   }
}