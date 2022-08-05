vector<vector<int>> solve(TreeNode* root){
    vector<vector<int>> res;
    queue<TreeNode*>q;
    q.push(root);
    bool rightfill=true;

    while(!q.empty()){
        int sz = q.size();
        vector<int>t(sz, 0);
        int idx;
        if(rightfill)
            idx = sz-1;
        for(int i = 0 ; i < sz ; i++){
            TreeNode* ele = q.front(); q.pop();
            int val = ele->val;
            if(rightfill)
                t[idx-i] = val;
            else
                t[i] = val;

            if(ele->right) q.push(ele->right);
            if(ele->left) q.push(ele->left);
        }
        res.push_back(t);
        rightfill = !rightfill;
    }
    return res;
}