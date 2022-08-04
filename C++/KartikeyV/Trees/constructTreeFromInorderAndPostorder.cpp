TreeNode* makeTree(vector<int>&inorder, int inStart, int inEnd, vector<int>&postorder, int postStart, int postEnd,unordered_map<int, int>&inmap){
    if(inStart>inEnd or postStart>postEnd) return NULL;

    int r = postorder[postEnd];
    TreeNode* root = new TreeNode(r);
    int rootidx = inmap[r];
    int leftCount = rootidx-inStart;

    root->left = makeTree(inorder, inStart, rootidx-1, postorder, postStart, postStart+leftCount-1, inmap);
    root->right = makeTree(inorder, rootidx+1, inEnd, postorder, postStart+leftCount, postEnd-1, inmap);
    return root;
}


TreeNode* solve(int n1, vector<int> inorder, int n2, vector<int> postorder){
    unordered_map<int, int>inmap;

    for(int i = 0 ; i < n1 ; i++) 
        inmap[inorder[i]] = i;

    return makeTree(inorder, 0, n1-1, postorder, 0, n2-1, inmap);
}