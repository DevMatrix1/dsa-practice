// link- https://devsnest.in/algo-challenges/balanced-binary-tree?tab=question

static int solve(TreeNode root){
//CODE HERE 
if(helper(root)==-1){
    return 0;
}
else{
    return 1;
}
}

static int helper(TreeNode root){

if(root==null) return 0;
    
int lr=helper(root.left);

if(lr==-1) return -1;

int rr=helper(root.right);

if(rr==-1) return -1;
    
if(Math.abs(lr-rr)>1) return -1;
    
return Math.max(lr,rr)+1;
}