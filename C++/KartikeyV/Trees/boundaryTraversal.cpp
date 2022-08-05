void getLeftBoundary(TreeNode* root, vector<int>& res){
    if((root==NULL) or (root->left==NULL and root->right == NULL)){
        return;
    }
    res.push_back(root->val);
    if(root->left!=NULL) return getLeftBoundary(root->left, res);
    getLeftBoundary(root->right, res);
}

void getLeafBoundary(TreeNode* root, vector<int>& res){
    if(root==NULL) return;

    if(root->left==NULL and root->right == NULL){
        return res.push_back(root->val);
    }
    
    getLeafBoundary(root->left, res);
    getLeafBoundary(root->right, res);
}

void getRightBoundary(TreeNode* root, stack<int>& rightB){
    if((root==NULL) or (root->left==NULL and root->right == NULL)){
        return;
    }
    rightB.push(root->val);
    if(root->right!=NULL) return getRightBoundary(root->right, rightB);
    getRightBoundary(root->left, rightB);
    
}

vector<int> solve(TreeNode* root){
    vector<int> res;
    res.push_back(root->val);
    if(root->left==NULL and root->right == NULL) return res;
    getLeftBoundary(root->left, res);
    getLeafBoundary(root, res);
    stack<int> rightB; 
    getRightBoundary(root->right, rightB);
    while(!rightB.empty()){
        res.push_back(rightB.top());
        rightB.pop();
    }
    return res;
}