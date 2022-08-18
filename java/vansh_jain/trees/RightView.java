static int[] solve(TreeNode root){
    //CODE HERE 
    List<Integer> list = new ArrayList<>();
    findRightView(root,list,0);
    return list.stream().mapToInt(i->i).toArray();
    }
    
    static void findRightView(TreeNode root, List<Integer> list,int level){
        if(root == null)
            return;
        if(level==list.size())
            list.add(root.val);
        findRightView(root.right,list,level+1);
        findRightView(root.left,list,level+1);
    }