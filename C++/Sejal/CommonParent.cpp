//https://www.devsnest.in/lms?id=58&slug=common-parent&tab=discussions&uniqueId=c-solution-66b1c8

TreeNode* solve(TreeNode* root, int p, int q){
//CODE HERE 
    if (root == NULL)
        return NULL;
    if (root->val == p || root->val == q)
        return root;
    TreeNode* l = solve(root->left, p, q);
    TreeNode* r = solve(root->right, p, q);
    if (l != NULL && r != NULL) 
        return root;
    else if (l != NULL)
        return l;
    else 
        return r;
    return NULL;
}
