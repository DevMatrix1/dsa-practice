vector<vector<int>> solve(TreeNode* root){
//Baby Shark dooooo 
vector<vector<int>> ans;
queue<TreeNode*>q;
q.push(root);

int count =0;
if(root == NULL)
return ans;

while(1){
    int size = q.size();
    if(size == 0)
    return ans;

    vector<int>data;
count++ ;
    while(size>0){
        TreeNode* temp = q.front();
        q.pop();

    data.push_back(temp->val);
    if(temp->left != NULL)
    q.push(temp->left);
    if(temp->right != NULL)
    q.push(temp->right);
    size--;

   }
   if(count%2==0)
   reverse(data.begin(), data.end());
     ans.push_back(data);
}
return ans;
}
    
