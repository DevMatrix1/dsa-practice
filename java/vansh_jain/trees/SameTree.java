static int solve(TreeNode p, TreeNode q){
    //CODE HERE 
    if(p==null && q==null)
        return 1;
    if((p!=null && q==null) || (p==null && q!=null) || (p!=null && q!=null && p.val!=q.val))
        return 0;
    
    // System.out.println(p.val+" "+q.val);
    if(solve(p.left,q.left)==1 &&
    solve(p.right,q.right) ==1)
        return 1;
    return 0;
    }