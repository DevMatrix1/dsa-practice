using namespace std;
#include <iostream> 

struct node{
    node*right;
    node*left;
    int data;
    node (int x){
        right = left = NULL;
        data = x;
    }
};

node*getSuccessor(node*root){
    node*curr = root->right;
    while(curr!=NULL && curr->left!=NULL) curr = curr->left;
    return curr;
}

node*BSTdelete(node*root,int x){
    if(root == NULL) return root;
    if(root->data > x) root->left = BSTdelete(root->left,x);
    else if(root->data < x) root->right = BSTdelete(root->right,x);
    else {
        if(root->right==NULL){
            node*temp = root->left;
            delete root;
            return temp;
        }
        else if(root->left==NULL){
            node*temp = root->right;
            delete root;
            return temp;
        } else {
            node*succ = getSuccessor(root);
            root->data = succ->data;
            root->right = BSTdelete(root->right,succ->data);
        }
    }
    return root;
}

int main(){
 
}