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

bool isBST(node*root,int min,int max){
    if(root==NULL) return true;
    return(root->data>min && root->data<max && isBST(root->left,min,root->data) && isBST(root->left,root->data,max));
}


//Another one
//a BST is BST if its inorder transversal is sorted

int main(){
 
}