TreeNode* solve(TreeNode* root, int p, int q){
    if(root == NULL) return NULL;

    if(root->val == p or root->val == q) 
        return root;
    
    TreeNode* left = solve(root->left, p, q);
    TreeNode* right = solve(root->right, p, q);

    if(left != NULL and right != NULL)
        return root;
    
    if(left!=NULL) 
        return left;
    return right;
}