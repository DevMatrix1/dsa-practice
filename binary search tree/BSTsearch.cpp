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

bool BSTsearch(node*root, int x){ //TC = O(h) SC(recursive) = O(h)  SC(iterative) = O(1)
    if(root == NULL) return false;
    else if (root->data == x) return true;
    else if (root->data > x) return BSTsearch(root->left,x);
    else return BSTsearch(root->right,x);
}

int main(){
 
}