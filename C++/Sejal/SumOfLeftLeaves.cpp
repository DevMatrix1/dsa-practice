// https://devsnest.in/lms?id=59&slug=sum-of-left-leaves

int solveHelp(TreeNode* root) {
    int sum = 0;
    if (root == NULL)
        return 0;
    if (root->left != NULL && root->left->left == NULL && root->left->right == NULL)
        sum += root->left->val;
    return sum + solveHelp(root->left) + solveHelp(root->right);
}

int solve(TreeNode* root){
//CODE HERE 
    int sum;
    sum = solveHelp(root);
    return sum;
}
