static TreeNode solve(int n1, int n2, int[] preorder, int[] inorder){
    //CODE HERE
    Map<Integer,Integer> hm = new HashMap<>();
    for(int i = 0;i<n2;i++ )
        hm.put(inorder[i],i);
    return constructTree(preorder, 0, n1-1, inorder, 0, n2-1, hm);
    
    }
    static TreeNode constructTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer,Integer> hm){
        if(preStart>preEnd || inStart>inEnd)    return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = hm.get(root.val);
        int left = index-inStart;
        root.left = constructTree(preorder,preStart+1,preStart+left,inorder,inStart,index-1,hm);
        root.right = constructTree(preorder,preStart+left+1,preEnd,
        inorder,index+1,inEnd,hm);
        return root;
    
    }
    