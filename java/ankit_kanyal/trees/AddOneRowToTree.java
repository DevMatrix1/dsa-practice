// link- https://leetcode.com/problems/add-one-row-to-tree/

class Solution {
    public TreeNode addOneRow(TreeNode root, int value, int depth) {
        if (depth == 0 || depth == 1) {
            TreeNode newroot = new TreeNode(value);
            newroot.left = depth == 1 ? root : null;
            newroot.right = depth == 0 ? root : null;
            return newroot;
        }
        if (root != null && depth >= 2) {
            root.left  = addOneRow(root.left,  value, depth > 2 ? depth - 1 : 1);
            root.right = addOneRow(root.right, value, depth > 2 ? depth - 1 : 0);
        }
        return root;
    }
}
