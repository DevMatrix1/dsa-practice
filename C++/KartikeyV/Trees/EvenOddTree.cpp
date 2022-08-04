int solve(TreeNode* root){
    queue<TreeNode*>q;
    q.push(root);
    int prev = 0;
    bool evenLevel=true;

    while(!q.empty()){
        int sz = q.size();
        if(evenLevel) prev = 0;
        else prev = 10000000;
        for(int i = 0 ; i < sz ; i++){
            TreeNode* ele = q.front(); q.pop();
            int val = ele->val;
            if(evenLevel){
                if(val>prev and val%2==1)
                    prev = val;
                else 
                    return 0;
            }else{
                if(val<prev and val%2==0)
                    prev = val;
                else
                    return 0;
            }
            if(ele->left) q.push(ele->left);
            if(ele->right) q.push(ele->right);
        }
        evenLevel = !evenLevel;
    }
    return 1;
}