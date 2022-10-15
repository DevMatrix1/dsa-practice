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

void identifyNodes(node*root){
    node*prev = NULL, *first = NULL, *second = NULL;
    if(root==NULL) return;
    identifyNodes(root->left);
    if(prev != NULL && root->data < prev->data){
        if(first == NULL)
        first = prev;
        second = root;
    }
    prev = root;
    identifyNodes(root->right);
}

//swap nhi karega ye function vo main m krna padega
int main(){
 
}