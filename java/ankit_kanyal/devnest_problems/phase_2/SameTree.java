// link- https://devsnest.in/algo-challenges/same-tree?tab=question

static int solve(TreeNode p, TreeNode q){
//CODE HERE 
if(p==null && q==null) return 1;
if(p==null || q==null) return 0;
int left=0,right=0;
if(p.val==q.val){
    left=solve(p.left,q.left);
    right=solve(p.right,q.right);
}
if(left==1 && right==1) return 1;
return 0;
    
}

