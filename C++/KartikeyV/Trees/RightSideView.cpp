void getRightSideView(TreeNode* root, int level, unordered_map<int, int>&umap){
    if(root == NULL) return;
    umap[level] = root->val;
    getRightSideView(root->left, level+1, umap);
    getRightSideView(root->right, level+1, umap);
}

vector<int> solve(TreeNode* root){
    unordered_map<int, int> umap; //Level->Node Value
    getRightSideView(root, 0, umap);
    vector<int> ans;
    for(int i = 0 ; i <umap.size() ; i++){
        ans.push_back(umap[i]);
    }
    return ans;
}