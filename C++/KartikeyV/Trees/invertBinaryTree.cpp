TreeNode* solve(TreeNode* root){
    if(root == NULL) return NULL;
    solve(root->left);
    solve(root->right);
    TreeNode* temp = root->right;
    root->right = root->left;
    root->left = temp;
    return root;
}