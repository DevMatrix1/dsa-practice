void calc(TreeNode* root, int val, int &res){
    if(root==NULL) return;
    if(root->left==NULL and root->right==NULL){
        res+=(val*2+root->val);
        return;
    }
    val = val*2+root->val;
    calc(root->left, val, res);
    calc(root->right, val, res);
}

int solve(TreeNode* root){
    int res = 0;
    calc(root, 0, res);
    return res;
}