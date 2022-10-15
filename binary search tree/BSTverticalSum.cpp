using namespace std;
#include <iostream> 
#include <map> 

struct node{
    node*right;
    node*left;
    int data;
    node (int x){
        right = left = NULL;
        data = x;
    }
};

void VsumR(node*root,int n, map<int,int> &m){
    if(root == NULL) return ;
    VsumR(root->left,(n-1),m);
    m[n] += root->data; //iss line ka mtlb h ki agr ye key uske andr nhi h to usse ye map m add kr lega aur agr h to uski purani value ke saath add kr degas
    VsumR(root->right,n+1,m);
}

void Vsum(node*root){
    map<int,int> m;
    VsumR(root,0,m);
    for(auto x : m){
        cout<<(x.second)<<" ";
    }
}

int main(){
 
}