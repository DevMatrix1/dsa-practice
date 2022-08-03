//link:- https://devsnest.in/algo-challenges/merge-two-binary-trees?tab=question

static TreeNode solve(TreeNode root1, TreeNode root2){
    //CODE HERE 
        if(root1 == null && root2 == null){
            return null;
        }
    
        if(root1 != null && root2 != null){
            root1.val = root1.val + root2.val;
            root1.left = solve(root1.left, root2.left);
            root1.right = solve(root1.right, root2.right);
        }
    
        return root1 != null? root1: root2;
    }