// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;

        if(root == p || root == q) // curr node is either p or q than return that node/root
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null) // left and right dono side se null nahi aaya than that means curr node is the LCA
            return root;

        // agar left side se null aaya but right side se koi value aaya hai then right side k value ko return karo else left side k value ko
        return left == null ? right : left; 
    }
}
// Variation 2: If both the values are stacked on top of each other, i.e. p = 5, q = 2 then left se bas 5 return hoga and 2 k pass call jayegi hi nahi then also we will return the LCA as 3 cuz koi v not null value mil rahi hai to use hi retun kar rhae hai, last line
 
// TC: O(N)
// SC: O(N), Recursive Stack space 
