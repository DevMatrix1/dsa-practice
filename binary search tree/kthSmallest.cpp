using namespace std;
#include <iostream> 

struct node{
    int data;
    node*left;
    node*right;
    node(int x){
        data = x;
        left = right = NULL;
    }
};

class Solution{
    public:
    int ans;
    void traverse(node*root, int k, int &index){
        if(!root) return;
        traverse(root->left,k,index);
        if(k==index){
            ans = root->data;
            index++;
            return;
        } else index++;
        traverse(root->right,k,index);
    }

    int kthsmallest(node*root,int k){
        ans = -1;
        int index = 1;
        traverse(root,k,index);
        return ans;
    }
};

int main(){
 
}