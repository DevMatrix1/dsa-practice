
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

//link: https://leetcode.com/problems/count-good-nodes-in-binary-tree
    //Approach: kept a max element till current_node checked with that if element is >= max then added 1 to the answer

//code is written as used in leetcode's ide
public class count_good_nodes_bt {
    private int helper(TreeNode root, int max){
        if(root == null)
            return 0;

        int count = 0;
        if(root.val >= max)
            count = 1;

        return count + helper(root.left, Math.max(max, root.val)) + helper(root.right, Math.max(max, root.val));
    }
    public int goodNodes(TreeNode root) {
        //as n(no. of nodes) >= 1, we can pass root.val without checking
        return helper(root, root.val);
    }

}
