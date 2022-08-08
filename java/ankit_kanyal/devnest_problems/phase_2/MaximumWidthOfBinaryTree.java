// link- https://devsnest.in/algo-challenges/maximum-width-of-binary-tree?tab=question

static int solve(TreeNode root){
if (root == null) {
           return 0;
       }
        return helper(root, 0, 1, new ArrayList<Integer>());
    
}

static int helper(TreeNode root, int depth, int index, List<Integer> list) {
        if (root == null) {
            return 0;
        }
		//add index of leftmost node to list, at depth'th position in list
        if (depth == list.size()) {
            list.add(index);
        }
        int currWidth = index - list.get(depth) + 1;
        int leftWidth = helper(root.left, depth + 1, index * 2, list);
        int rightWidth = helper(root.right, depth + 1, index * 2 + 1, list);
        return Math.max(currWidth, Math.max(leftWidth, rightWidth));
    }