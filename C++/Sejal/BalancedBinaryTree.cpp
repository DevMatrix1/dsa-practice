//https://www.devsnest.in/lms?id=59&slug=balanced-binary-tree&tab=question

int depth(TreeNode* root) {
    if (root == NULL)
        return 0;
    return 1 + max(depth(root->left), depth(root->right));
}
int solve(TreeNode* root){
//CODE HERE 
    int lh = depth(root->left);
    int rh = depth(root->right);
    return ((rh - lh >= -1) && (rh - lh <= 1));
}
