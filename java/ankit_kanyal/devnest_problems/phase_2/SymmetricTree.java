// link- https://devsnest.in/algo-challenges/symmetric-tree?tab=question

static int solve(TreeNode root){
if(Symmetric(root.left,root.right)){
       return 1;
   }
   return 0;
}

public static boolean Symmetric(TreeNode p,TreeNode q){
    if(p==null && q==null) return true;

    if(p!=null && q==null || p==null && q!=null || p.val!=q.val)        return false;

    if(!Symmetric(p.left,q.right)){
        return false;
    }
    if(!Symmetric(p.right,q.left)){
        return false;
    }
    
    return true;
}