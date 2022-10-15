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

node*BSTinsert(node*root,int x){
    node*temp = new node(x);
    if(root == NULL) return temp;
    if(root->data == temp->data) return;
    if(root->data>x) root->left = BSTinsert(root->left,x);  //yaha pe ye root->left isliye likha kyunki sirf recursive call se to uski position aayegi usse link bhi to krna h
    if(root->data<x) root->right = BSTinsert(root->right,x);

    return root;
}

int main(){
 
}