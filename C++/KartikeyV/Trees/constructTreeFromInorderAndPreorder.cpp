TreeNode* getTree(vector<int> &preorder, int ps, int pe,vector<int> &inorder,int is, int ie, unordered_map<int, int>&inmap){
    if(ps>pe or is>ie) return NULL;

    int rootidx = inmap[preorder[ps]];
    int leftEle = rootidx-is;
    int rightEle = ie - rootidx;

    TreeNode* r = new TreeNode(preorder[ps]);

    r->left = getTree(preorder, ps+1, ps+leftEle, inorder, is, rootidx-1,inmap);
    r->right = getTree(preorder, ps+leftEle+1, pe, inorder, rootidx+1, ie, inmap);
    return r;
}

TreeNode* solve(int n1, int n2, vector<int> preorder, vector<int> inorder){
    unordered_map<int, int> inmap;
    for(int i = 0 ; i < inorder.size() ; i++){
        inmap[inorder[i]] = i;
    }

    return getTree(preorder, 0, n1-1, inorder, 0, n2-1, inmap);
}