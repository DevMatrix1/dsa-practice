#pragma once
#include "BSTNode.h"


template<class T>
class BST
{
public:
	BST();
	~BST();
	BST(const BST& obj);
	void destructor(BSTNode<T>* root);
	void setRoot(T value);
	void insert(T value);
	BSTNode<T>* getLeftChild(BSTNode<T>* node);
	BSTNode<T>* getRightChild(BSTNode<T>* node);
	BSTNode<T>* search(T val);
	void printNodes(BSTNode<T>* root);
	bool isBST(BSTNode<T>* root);
	void deleteNode(BSTNode<T>* node);
	bool isEqual(BSTNode<T>* r1, BSTNode<T>* r2);
	bool isInternalNode(BSTNode<T>* node);
	bool isExternalNode(BSTNode<T>* node);
	int getHeight();
	int getHeight(BSTNode<T>* node);
	void displayDescedents(T val);
	void displayAncestors(T val);
	int getNodeCount(BST<T>* tree);
	T findMin();
	T findMax();
	BST<T>* getMirrorImage();
	void printTree();
	BSTNode<T>* getRoot()
	{
		return root;
	}
private:
	BSTNode<T>* root;
};

