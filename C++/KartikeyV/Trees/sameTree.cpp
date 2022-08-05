int solve(TreeNode* p, TreeNode* q){
    //Structure and Values should be same
    if(p==NULL or q == NULL) return p==q;
    return (p->val == q->val and solve(p->left, q->left) and solve(p->right, q->right));
}