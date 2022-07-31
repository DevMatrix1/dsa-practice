static int[] solve(TreeNode root){
    //CODE HERE 
List<Integer> result = new ArrayList<>();
getPreOrder(root,result);
return result.stream().mapToInt(Integer::intValue).toArray();
    
}

static void getPreOrder(TreeNode node, List<Integer> list){
    if(node==null)
        return;
    getPreOrder(node.left,list);
    list.add(node.val);
    getPreOrder(node.right,list);
}