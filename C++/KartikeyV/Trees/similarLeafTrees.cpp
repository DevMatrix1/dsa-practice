void getLeafs(TreeNode* root, vector<int> &v){
    if(root==NULL) return;
    if(!root->left and !root->right){
        v.push_back(root->val);
        return;
    }
    getLeafs(root->left, v);
    getLeafs(root->right, v);
}


int solve(TreeNode* root1, TreeNode* root2){
    vector<int> v1, v2; 
    getLeafs(root1, v1);
    getLeafs(root2, v2);
    if(v1.size() != v2.size()) return 0;
    for(int i = 0 ; i < v1.size() ; i++){
        if(v1[i]!=v2[i])
            return 0;
    }
    return 1;
}