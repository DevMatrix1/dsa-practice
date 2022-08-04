int getDiameter(TreeNode* root, int& mx){
    if(root==NULL) return 0;
    int l = getDiameter(root->left, mx);
    int r = getDiameter(root->right, mx);
    mx = max(mx, l+r);
    return max(l,r)+1;
}

int solve(TreeNode* root){
    //Edges = Nodes-1
    int mx = INT_MIN;
    getDiameter(root, mx);
    return mx;
}