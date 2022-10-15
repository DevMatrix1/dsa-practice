using namespace std;
#include <iostream> 
#include <unordered_set> 

struct node{
    node*right;
    node*left;
    int data;
    node (int x){
        right = left = NULL;
        data = x;
    }
};

bool isPairSum(node*root,int sum,unordered_set<int>&s){
    if(root==NULL) return false;
    if(isPairSum(root->left,sum,s)==true) return true;
    if(s.find(sum-(root->data))!=s.end()) return true;
    else s.insert(root->data);

    return (isPairSum(root->right,sum,s));
}

int main(){
 
}