// link- https://devsnest.in/algo-challenges/tree-boundary?tab=question

static boolean isLeaf(TreeNode root){
    return root.left==null && root.right==null;
}

static void addLeaves(TreeNode root, List<Integer> result) {
        if (isLeaf(root)) {
            result.add(root.val);
            return;
        }
        if (root.left!=null) addLeaves(root.left, result);
        if (root.right!=null) addLeaves(root.right, result);
    }

static int[] solve(TreeNode root){
//CODE HERE 
if(root==null) return new int[]{};
List<Integer> result=new ArrayList<>();

if(!isLeaf(root)) result.add(root.val);
// for left boundary

TreeNode cur=root.left;

while(cur!=null){
    if(!isLeaf(cur)) result.add(cur.val);
    if(cur.left!=null) cur=cur.left;
    else cur=cur.right;
}

// add leaves nodes
cur=root.right;
addLeaves(root,result);

Stack<Integer> stack=new Stack<>();
while(cur!=null){
    if(!isLeaf(cur)) stack.push(cur.val);
    if(cur.right!=null) cur=cur.right;
    else cur=cur.right;
}

while(!stack.empty()){
    result.add(stack.pop());
}

return result.stream().mapToInt(Integer::intValue).toArray();

}