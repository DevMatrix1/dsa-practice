int solve(TreeNode* root){
    if(root == NULL) return 0;
    return (1+max(solve(root->right), solve(root->left)));
}