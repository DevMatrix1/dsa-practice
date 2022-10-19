#pragma once
#include<iostream>
#include<stack>
#include<queue>
#include<math.h>
using namespace std;

template<class T>
class BinaryTree
{
private:
    int height;
    // represent the maximum possible height of the tree.
    T* data;
    // stores the tree nodes.
    bool* status;
    // this array is used to find that whether there is a
    // node on a particular index or not. If there is a valid
    // node exitsts on a particular index the status array holds
    // 'true' on corresponding index.
public:
    //initializes all the data members
    BinaryTree(int h);
    ~BinaryTree();
    // set val at data[0] as a root of tree and set status[0] = true;
    void setRoot(T val);
    // returns the root of tree if exists.
    T getRoot();
    // sets the left child of given Parent.
    void setLeftChild(T parent, T val);
    // sets the right child of given Parent.
    void setRightChild(T parent, T val);
    // returns the index of parent node.
    int getParent(int node);
    int getLeftChild(int par);
    int getRightChild(int par);
    void remove(T node);
    // display tree nodes using preOrder Traversal.
    void preOrder();
    // display tree nodes using postOrder Traversal.
    void postOrder();
    // display tree nodes using inOrder Traversal.
    void inOrder();
    // display tree nodes using levelOrder Traversal. 
    void levelOrder();
    void displayAncestors(T node);
    void displayDescendents(T node);
    // returns true if the tree is perfect, otherwise false.
    bool isPerfectTree();
    // returns true if the tree is complete, otherwise false.
    bool iscompleteTree();
};


