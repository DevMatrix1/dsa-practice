#include<iostream>
#include "BST.cpp"
using namespace std;

int main()
{
	//driver
	cout << "\t\t-:Binary Search Tree:-" << endl;
	BST<int> tree;
	tree.setRoot(19);
	tree.insert(2);
	tree.insert(4);
	tree.insert(13);
	tree.insert(76);
	tree.insert(35);
	tree.insert(81);
	tree.insert(102);
	cout << "\nWe Have Following Tree :-" << endl;
	tree.printTree();
	int var, data;
	cout << "\t-:inserting:-\n" << endl;
	do
	{
		cout << endl;
		cout << "\nWanna Insert More Values(0/1) ? ";
		cin >> var;
		if (var)
		{
			cout << "Enter Data:-";
			cin >> data;
			tree.insert(data);
			cout << "\nNow! We Have Following Nodes :-" << endl;
			tree.printNodes(tree.getRoot());
		}
		
	} while (var);
	cout << "\n\t-:Searching:-\n" << endl;
	do
	{
		cout << endl;
		cout << "Wanna Search Nodes(0/1) ? ";
		cin >> var;
		if (var)
		{
			cout << "Enter Data:-";
			cin >> data;
			if (tree.search(data))
				cout << "Node Exist!" << endl;
			else
				cout << "Node Does Not Exist!" << endl;
		}
	} while (var);
	cout << "\n\t-:Getting Left Child:-\n" << endl;
	do
	{
		cout << endl;
		cout << "Wanna get Left Child Of Any Nodes(0/1) ? ";
		cin >> var;
		if (var)
		{
			cout << "Enter Data:-";
			cin >> data;
			if (tree.search(data) != 0)
				cout << "Left Child At ::" << tree.getLeftChild(tree.search(data)) << endl;
			else
				cout << "Node Does Not Exist!";
		}
	} while (var);
	cout << "\n\t-:Getting Right Child:-\n" << endl;
	do
	{
		cout << endl;
		cout << "Wanna get Right Child Of Any Nodes(0/1) ? ";
		cin >> var;
		if (var)
		{
			cout << "Enter Data:-";
			cin >> data;
			if (tree.search(data) != 0)
				cout << "Right Child At ::" << tree.getRightChild(tree.search(data)) << endl;
			else
				cout << "Node Does Not Exist!" << endl;
		}
	} while (var);
	cout << "\n\t-:Printing All Nodes:-\n" << endl;
	cout << "Wanna Print All Nodes(0/1) ? ";
	cin >> var;
	if (var)
		tree.printNodes(tree.getRoot());
	cout << endl;
	cout << "\n\t-:Printing Height:-\n" << endl;
	cout << "Wanna Get Height(0/1) ? ";
	cin >> var;
	if (var)
		cout << "Height is::" << tree.getHeight() << endl;
	cout << "\n\t-:Printing Min Node:-\n" << endl;
	cout << "Wanna Find Min Node(0/1) ? ";
	cin >> var;
	if (var)
		cout << "Min Node is::" << tree.findMin() << endl;
	cout << "\n\t-:Printing Max Node:-\n" << endl;
	cout << "Wanna Find Max Node(0/1) ? ";
	cin >> var;
	if (var)
		cout << "Max Node is::" << tree.findMax() << endl;
	cout << "\n\t-:Printing Desendants:-\n" << endl;
	do
	{
		cout << endl;
		cout << "Wanna display Descendants Of Any Nodes(0/1) ? ";
		cin >> var;
		if (var)
		{
			cout << "Enter Data:-";
			cin >> data;
			if (tree.search(data))
				tree.displayDescedents(data);
			else
				cout << "Node Does Not Exist!";
		}
	} while (var);
	cout << "\n\t-:Printing Ancestors:-\n" << endl;
	do
	{
		cout << endl;
		cout << "Wanna display Ancestors Of Any Nodes(0/1) ? ";
		cin >> var;
		if (var)
		{
			cout << "Enter Data:-";
			cin >> data;
			if (tree.search(data))
				tree.displayAncestors(data);
			else
				cout << "Node Does Not Exist!";
		}
	} while (var);
	BST<int>* ob = &tree;
	cout << "\n\t-:Printing Node Count:-\n" << endl;
	cout << "Wanna Find Count of Node(0/1) ? ";
	cin >> var;
	if (var)
		cout << "count of Nodes is::" << tree.getNodeCount(ob) << endl;
	cout << "\n\t-:Internal Nodes:-\n" << endl;
	do
	{
		cout << endl;
		cout << "Wanna check if any node is Internal(0/1) ? ";
		cin >> var;
		if (var)
		{
			cout << "Enter Data:-";
			cin >> data;
			if (tree.search(data))
				cout << "Is Internal = " << tree.isInternalNode(tree.search(data)) << endl;
			else
				cout << "Node Does Not Exist!";
		}
	} while (var);
	cout << "\n\t-:External Nodes:-\n" << endl;
	do
	{
		cout << endl;
		cout << "Wanna check if any node is External(0/1) ? ";
		cin >> var;
		if (var)
		{
			cout << "Enter data:-";
			cin >> data;
			if (tree.search(data))
				cout << "Is External = " << tree.isExternalNode(tree.search(data)) << endl;
			else
				cout << "Node Does Not Exist!";
		}
	} while (var);
	cout << "\n\t-:Copy Constructor's copy:-\n" << endl;
	cout << "Creating Copy Of Tree :-\n";
	BST<int> ptr = tree;
	cout << "Wanna check if both are equal(0/1) ? ";
	cin >> var;
	if (var)
	{
		cout << "Is Equal :- " << tree.isEqual(tree.getRoot(), ptr.getRoot()) << endl;
	}
	cout << "\n\t-:BST Tree:-\n" << endl;
	cout << "Wanna check Tree is BST(0/1) ? ";
	cin >> var;
	if (var)
	{
		cout << "Is BST :- " << tree.isBST(tree.getRoot()) << endl;
	}
	cout << "\n\t-:Getting Mirror\n" << endl;
	BST<int>* mirror; 
	cout << "Wanna Get Mirror(0/1) ? ";
	cin >> var;
	if (var)
	{
		mirror = ptr.getMirrorImage();
		mirror->printTree();
	}
	cout << "\n\t-:Deleting Nodes:-\n" << endl;
	do
	{
		cout << endl;
		cout << "Wanna Delete Nodes(0/1) ? ";
		cin >> var;
		if (var)
		{
			cout << "Enter Data:-";
			cin >> data;
			if (tree.getHeight() > 0)
			{
				if (tree.search(data))
					tree.deleteNode(tree.search(data));
				else
					cout << "Data Not Found" << endl;
				if (tree.getHeight() > 0)
				{
					cout << "\nNow! We Have Following Nodes :-" << endl;
					tree.printNodes(tree.getRoot());
				}
				else
				{
					cout << "TREE EMPTY!" << endl;
					break;
				}
			}
			else
			{
				cout << "TREE EMPTY!" << endl;
				break;
			}
		}
		
	} while (var);
	return 0;
}