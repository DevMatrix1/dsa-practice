/**
 * Link: https://leetcode.com/problems/search-in-a-binary-search-tree/
 * 
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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return null;
        
        if(val < root.val)
            return searchBST(root.left, val);
        if (val > root.val)
            return searchBST(root.right, val);
        else
            return root;
    }
}