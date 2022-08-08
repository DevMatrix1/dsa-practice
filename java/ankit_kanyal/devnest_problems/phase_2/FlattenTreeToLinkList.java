// link- https://devsnest.in/algo-challenges/flatten-tree-to-linked-list?tab=question

// help- https://leetcode.com/problems/flatten-binary-tree-to-linked-list/discuss/2340103/Two-different-approaches-faster-than-100-with-detailed-explanation-()-or-Java

//help- https://leetcode.com/problems/flatten-binary-tree-to-linked-list/discuss/2338861/JAVA-oror-Easy-Solution-With-Explanation

static TreeNode prev=null;

static TreeNode solve(TreeNode root){
    if(root==null)
        return null;
        solve(root.right);//traverse till right most.
        solve(root.left);//got to left of right most
       root.left=null;//set left as null
        root.right=prev;//set right to previously traversed node
        prev=root;  //set prev to current node.
        return root;
}