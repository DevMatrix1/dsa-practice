#pragma once
#include<iostream>
#include<stack>
#include<queue>
#include<iomanip>
using namespace std;

//forward declaration
template<class T>
class BST;

//node of tree
template<class T>
class BSTNode
{
	friend BST<T>;
	T data;
	BSTNode<T>* left;
	BSTNode<T>* right;
	BSTNode(T data, BSTNode<T>* left=nullptr,BSTNode<T>* right=nullptr)
	{
		this->data = data;
		this->left = left;
		this->right = right;
	}
};