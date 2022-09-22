/**
 * Link: https://leetcode.com/problems/validate-binary-search-tree/
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
    public boolean ifBST(TreeNode root, long l, long r){
        if(root == null)
            return true;
        int a = root.val;
        boolean flag = (l < a && a < r);
        boolean left = ifBST(root.left, l, a);
        boolean right = ifBST(root.right, a, r);
        return (flag && left && right);
    }
    public boolean isValidBST(TreeNode root) {
        return ifBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}