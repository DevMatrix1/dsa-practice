#pragma once
#include<iostream>
#include "BinaryTree.cpp"
using namespace std;

int main()
{
	//driver
	cout << "\t\t-:Binary Tree:-" << endl;
	BinaryTree<int> bt(4);
	bt.setRoot(1);
	bt.setLeftChild(1, 2);
	bt.setLeftChild(2, 4);
	bt.setRightChild(2, 6);
	bt.setLeftChild(4, 8);
	bt.setRightChild(4, 10);
	bt.setLeftChild(6, 12);
	bt.setRightChild(6, 14);
	bt.setRightChild(1, 3);
	bt.setLeftChild(3, 6);
	bt.setRightChild(3, 9);
	bt.setLeftChild(6, 12);
	bt.setRightChild(6, 15);
	bt.setLeftChild(9, 18);
	cout << endl;
	cout << "We Have Following Binary Tree :-" << endl;
	cout << endl;
	bt.levelOrder();
	cout << endl;
	cout << "\nPreOrder Traversal" << endl;
	cout << endl;
	bt.preOrder();
	cout << endl;
	cout << "\nPostOrder Traversal" << endl;
	cout << endl;
	bt.postOrder();
	cout << endl;
	cout << "\nInOrder Traversal" << endl;
	cout << endl;
	bt.inOrder();
	cout << endl;
	cout << "\nLevelOrder Traversal" << endl;
	cout << endl;
	bt.levelOrder();
	cout << endl;
	cout << "\nTree is complete tree = " << bt.iscompleteTree() << endl;
	cout << "\nTree is perfect tree = " << bt.isPerfectTree() << endl;
	cout << "\nRoot of tree is = " << bt.getRoot() << endl;
	cout << "\nDesendents of 2 are = ";
	bt.displayDescendents(2);
	cout << endl;
	cout << "\nAncestors of 10 are = ";
	bt.displayAncestors(10);
	cout << endl;
	cout << "\nparent index of 9 exist at = " << bt.getParent(6) << endl;
	cout << "\nleft child of 4 is = " << bt.getLeftChild(3) << endl;
	cout << "\nRight child of 4 is = " << bt.getRightChild(3) << endl;
	cout << "\nRemoving 2 and its desendents :- ";
	cout << endl;
	bt.remove(2);
	cout << "\nLevelOrder" << endl;
	cout << endl;
	bt.levelOrder();
	cout << endl;
	return 0;
}