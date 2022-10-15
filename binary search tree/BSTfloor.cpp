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

node*BSTfloor(node*root,int x){
    node*res = NULL;
    while(root!=NULL){
        if(root->data == x) return root;
        else if(root->data > x) root = root->left;
        else{
            res = root;
            root = root->right;
        }
    }
    return res;
}

int main(){
 
}