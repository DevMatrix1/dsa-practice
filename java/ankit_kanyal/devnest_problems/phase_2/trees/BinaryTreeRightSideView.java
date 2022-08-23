// https://devsnest.in/algo-challenges/binary-tree-right-side-view?tab=question

static int[] solve(TreeNode root){
//CODE HERE
Queue<TreeNode> treeNodes = new LinkedList<TreeNode> ();

List<Integer> treeRightView = new ArrayList<Integer> ();

treeNodes.add(root);

while (!treeNodes.isEmpty()) {

    int n = treeNodes.size();
    for (int i = 0; i < n; i++) {

        TreeNode currentNode = treeNodes.peek();

        treeNodes.poll();

        if (i == 0) {
            treeRightView.add(currentNode.val);
        }

        if (currentNode.right != null) {
            treeNodes.add(currentNode.right);
        }

        if (currentNode.left != null) {
            treeNodes.add(currentNode.left);
        }
    }
}
int[] temp = treeRightView.stream().mapToInt(Integer::intValue).toArray();



return temp; 
}