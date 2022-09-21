//link: https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/

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
class Solution {
    private int sum = 0;
    private void storeGreaterSum(TreeNode root){
        if(root == null)    return;
        storeGreaterSum(root.right);
        root.val = sum + root.val;
        sum = root.val;
        storeGreaterSum(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        sum = 0;
        storeGreaterSum(root);
        return root;
    }
}