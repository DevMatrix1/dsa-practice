int checkSymmetric(TreeNode *p, TreeNode *q){
    if(p==NULL or q==NULL) return p==q;
    // cout << p->val << ' '<<q->val <<endl;
    return (p->val == q->val and checkSymmetric(p->left,q->right) and checkSymmetric(p->right,q->left));
}

int solve(TreeNode* root){
    return checkSymmetric(root->right, root->left);
}