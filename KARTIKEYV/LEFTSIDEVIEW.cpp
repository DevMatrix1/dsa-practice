#include<iostream>
#include<bits/stdc++.h>
using namespace std;
struct node
{
	int data;
	node* left;
	node* right;
    node(int val)
	{
		data=val;
		left=right=NULL;
	}
};class solution
{
    private:
    void recursion(node* root,int level,vector<int>&ans)
    {
        if(root==NULL)return;
        if(level==ans.size())ans.push_back(root->data);
        recursion(root->left,level+1,ans);
        recursion(root->right,level+1,ans);


    }
    public:
	vector<int>leftview(node* root)
	{
		vector<int>ans;
		recursion(root,0,ans);
		return ans;
	}

};int main()
{
	struct node* root=new node(1);
	root->left=new node(2);
	root->right=new node(3);
	root->left->left=new node(4);
	root->left->right=new node(5);
	root->right->left=new node(6);
	root->right->right=new node(7);
	solution ob;
	vector<int> vec=ob.leftview(root);
	for(int x:vec)
	{
		cout<<x<<" ";
	}
}
