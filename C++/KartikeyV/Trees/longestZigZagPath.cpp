int findPath(TreeNode* root, int k, bool isleft){
    if(root==NULL) return k-1;
    
    if(isleft){
        return max(findPath(root->left, 1, true), findPath(root->right, k+1, false));
    }else{
        return max(findPath(root->left, k+1, true), findPath(root->right, 1, false));
    }
}

int solve(TreeNode* root){
    return findPath(root,0, false);
}