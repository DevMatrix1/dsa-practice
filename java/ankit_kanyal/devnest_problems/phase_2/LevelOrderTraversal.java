// link- https://devsnest.in/algo-challenges/binary-tree-level-order-traversal?tab=question

public static List<List<Integer>> list=new ArrayList<>();

static int[][] solve(TreeNode root){
//CODE HERE 
LevelOrder(root);
int [][]ans=list.stream().map(l->l.stream().mapToInt(Integer::intValue).toArray()).toArray(int [][]::new);

return ans;
}

public static void LevelOrder(TreeNode root){
    Queue<TreeNode> queue=new LinkedList<TreeNode>();
    queue.add(root);
    while(queue.size()!=0){
        List<Integer> temp=new ArrayList<>();
        int size=queue.size();
        for(int i=0;i<size;i++){
            TreeNode node=queue.poll();
            temp.add(node.val);
            if(node.left!=null) queue.offer(node.left);
            if(node.right!=null) queue.offer(node.right);
        }
        list.add(temp);

    }

}