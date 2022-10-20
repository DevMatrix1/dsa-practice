#include "BST.h"

//inatiallize root
template<class T>
BST<T>::BST()
{
	root = nullptr;
}

//set root to given value
template<class T>
void BST<T>::setRoot(T value)
{
	this->root = new BSTNode<T>(value);
}

//insert value in BST at appropriate place
template<class T>
void BST<T>::insert(T value)
{
	if (!root)	// when tree is empty
		root = new BSTNode<T>(value);
	else
	{
		BSTNode<T>* temp = root;
		BSTNode<T>* prev = temp;
		while (temp)
		{
			if (temp->data > value)
			{
				prev = temp;
				temp = temp->left;
			}
			else
			{
				prev = temp;
				temp = temp->right;
			}
		}
		if (prev->data > value)
			prev->left = new BSTNode<T>(value);
		else
			prev->right = new BSTNode<T>(value);
	}
}

//return left child of given node
template<class T>
BSTNode<T>* BST<T>::getLeftChild(BSTNode<T>* node)
{
	return node->left;
}

//return right child of given node
template<class T>
BSTNode<T>* BST<T>::getRightChild(BSTNode<T>* node)
{
	return node->right;
}

//seach a given value in each node
template<class T>
BSTNode<T>* BST<T>::search(T val)
{
	BSTNode<T>* temp = root;
	while (temp)
	{
		if (temp->data == val)
			return temp;
		else
		{
			if (temp->data > val)
				temp = temp->left;
			else
				temp = temp->right;
		}
	}
	return nullptr;
}

//print all nodes data in preorder  traversal format
template<class T>
void BST<T>::printNodes(BSTNode<T>* root)
{
	if (root == nullptr)
		return;
	cout << root->data << " ";
	printNodes(root->left);
	printNodes(root->right);
}

//return true if tree of given root id BST
template<class T>
bool BST<T>::isBST(BSTNode<T>* root)
{
	if (root == nullptr)
		return true;
	if (root->left)
	{
		if (root->data < root->left->data )
			return false;
	}
	if (root->right)
	{
		if(root->data > root->right->data)
			return false;
	}
	isBST(root->left);
	isBST(root->right);
}

//delete givrn node and adjust its childs
template<class T>
void BST<T>::deleteNode(BSTNode<T>* node)
{
	if (node == nullptr)
		return;
	if (node->left == nullptr && node->right == nullptr)	// case 1
	{
		if (node == root)
		{
			delete root;
			root = nullptr;
			return;
		}
		BSTNode<T>* root = this->root;
		int status = -1;
		while (root)
		{
			if (root->left == node)
			{
				status = 1;
				break;
			}
			if (root->right == node)
			{
				status = 2;
				break;
			}
			if (node->data < root->data)
			{
				root = root->left;
			}
			else
				root = root->right;
		}
		if (status == 1)
		{
			delete node;
			node = nullptr;
			root->left = nullptr;
		}
		else if (status == 2)
		{
			delete node;
			node = nullptr;
			root->right = nullptr;
		}
		else
			cout << "Node Not Found" << endl;
	}
	else if (node->left != nullptr && node->right != nullptr) // case 3
	{
		BSTNode<T>* temp = node;
		temp = temp->left;
		while (temp->right != nullptr)
		{
				temp = temp->right;
		}
		T data = temp->data;
		deleteNode(temp);
		node->data = data;
	}
	else // case 1
	{
		if (node == root)
		{
			if (root->left)
				root = root->left;
			if (root->right)
				root = root->right;
			delete node;
			node = nullptr;
			return;
		}
		BSTNode<T>* root = this->root;
		int status = -1;
		while (root)
		{
			if (root->left == node)
			{
				status = 1;
				break;
			}
			if (root->right == node)
			{
				status = 2;
				break;
			}
			if (node->data < root->data)
			{
				root = root->left;
			}
			else
				root = root->right;
		}
		if (node->right)
		{
			if (status == 1)
				root->left = node->right;
			else if (status == 2)
				root->right = node->right;
			delete node;
			node = nullptr;
		}
		else
		{
			if (status == 1)
				root->left = node->left;
			else if (status == 2)
				root->right = node->left;
			delete node;
			node = nullptr;
		}
	}
}

//return true if trees whose root are passed are equal
template<class T>
bool BST<T>::isEqual(BSTNode<T>* r1, BSTNode<T>* r2)
{
	stack<BSTNode<T>*> s1;
	stack<BSTNode<T>*> s2;
	if (r1->data != r2->data)
		return false;
	s1.push(r1);
	s2.push(r2);
	while (s1.size() || s2.size())
	{
		if (s1.size() == s2.size())
		{
			if (s1.top()->data != s2.top()->data)
				return false;
		}
		else
			return false;
		if (s1.size())
		{
			r1 = s1.top();
			s1.pop();
			
		}
		if (s2.size())
		{
			r2 = s2.top();
			s2.pop();
		}
		if (r1->right)
		{
			s1.push(r1->right);
		}
		if (r2->right)
		{
			s2.push(r2->right);
		}
		if (r1->left)
		{
			s1.push(r1->left);
		}
		if (r2->left)
		{
			s2.push(r2->left);
		}	
	}
	return true;
}

//return true if node have deg >0
template<class T>
bool BST<T>::isInternalNode(BSTNode<T>* node)
{
	if (node->left != nullptr || node->right != nullptr)
		return true;
	else
		return false;
}

//return true if node deg = 0
template<class T>
bool BST<T>::isExternalNode(BSTNode<T>* node)
{
	if (node->left == nullptr && node->right == nullptr)
		return true;
	else
		return false;
}

//return longest path length from root to leaf
template<class T>
int BST<T>::getHeight()
{
	BSTNode<T>* node = this->root;
	return getHeight(node); 
}

//recursion of height getting function
template<class T>
int BST<T>::getHeight(BSTNode<T>* node)
{

	int left, right;
	if (node == nullptr)
		return 0;
	right = getHeight(node->right);
	left = getHeight(node->left);
	if (left < right)
		return right + 1;
	return left + 1;
}

//deisplay all desendants from node to all possiblr leafs below it
template<class T>
void BST<T>::displayDescedents(T val)
{
	BSTNode<T>* root = this->root;
	while (root->data!=val)
	{
		if (val < root->data)
		{
			root = root->left;
		}
		else
			root = root->right;
	}
	if (root && root->left == nullptr && root->right == nullptr)
	{
		cout << "No Desendants" << endl;
		return;
	}
	stack<BSTNode<T>*> s;
	int first = 1;
	if (root)
	{
		s.push(root);
		while (s.size() != 0)
		{ 
			if (s.size())
			{
				if (first == 0)
					cout << s.top()->data << endl;
				root = s.top();
				s.pop();
			}
			first = 0;
			if (root->right)
				s.push(root->right);
			if (root->left)
				s.push(root->left);
		}
	}
	else
	{
		cout << "Node Doesn't Exist" << endl;
	}

}

//display path from given node to root
template<class T>
void BST<T>::displayAncestors(T val)
{
	BSTNode<T>* rot = this->root;
	while (rot->data != val)
	{
		if (val < rot->data)
		{
			rot = rot->left;
		}
		else
			rot = rot->right;
	}
	if (rot==this->root)
	{
		cout << "No Ancestors" << endl;
		return;
	}
	BSTNode<T>* root = this->root;
	cout << root->data << endl;
	while (root)
	{
		if (root->left && root->left->data == val)
		{
			break;
		}
		if (root->right && root->right->data == val)
		{
			break;
		}
		if (val < root->data)
		{
			if (root->left)
				root = root->left;
			else
				break;
			cout << root->data << endl;
		}
		else
		{
			if (root->right)
				root = root->right;
			else
				break;
			cout << root->data << endl;
		}
	}
}

//return # of nodes
template<class T>
int BST<T>::getNodeCount(BST<T>* tree)
{
	stack<BSTNode<T>*> s;
	int count = 0;
	BSTNode<T>* root = tree->getRoot();
	if (root)
	{
		s.push(root);
		while (s.size() != 0)
		{
			if (s.size())
			{
				count++;
				root = s.top();
				s.pop();
			}
			if (root->right)
				s.push(root->right);
			if (root->left)
				s.push(root->left);
		}
	}
	return count;
}

//return min value in tree
template<class T>
T BST<T>::findMin()
{
	stack<BSTNode<T>*> s;
	T min;
	BSTNode<T>* root = this->root;
	if (root)
	{
		s.push(root);
		min = root->data;
		while (s.size() != 0)
		{
			if (s.size())
			{
				if (min > s.top()->data)
					min = s.top()->data;
				root = s.top();
				s.pop();
			}
			if (root->right)
				s.push(root->right);
			if (root->left)
				s.push(root->left);
		}
	}
	return min;
}

//return max val in tree
template<class T>
T BST<T>::findMax()
{
	stack<BSTNode<T>*> s;
	T max;
	BSTNode<T>* root = this->root;
	if (root)
	{
		s.push(root);
		max = root->data;
		while (s.size() != 0)
		{
			if (s.size())
			{
				if (max < s.top()->data)
					max = s.top()->data;
				root = s.top();
				s.pop();
			}
			if (root->right)
				s.push(root->right);
			if (root->left)
				s.push(root->left);
		}
	}
	return max;
}

//return mirror of tree i.e all right & left nodes swwpaed
template<class T>
BST<T>* BST<T>::getMirrorImage()
{
	stack<BSTNode<T>*> s;
	BSTNode<T>* node =this->root;
	BSTNode<T>* temp = root;
	if (node)
	{
		s.push(node);
		while (s.size() != 0)
		{
			if (s.size())
			{
				node = s.top();
				temp = node->left;
				node->left = node->right;
				node->right = temp;
				s.pop();
			}
			if (node->right)
				s.push(node->right);
			if (node->left)
				s.push(node->left);
		}
	}
	return this;
}


//print nodes in tree format
template<class T>
void BST<T>::printTree()
{
	BSTNode<T>* node = this->root;
	BSTNode<T>* Gnode = new BSTNode<T>(NULL);
	queue<BSTNode<T>*> q;
	int count = 0;
	int space = this->getHeight();
	space = space * 4;
	int bspace = this->getHeight() * 3 + 1;
	if (node)
		q.push(node);
	for (int i = 0; i < this->getHeight(); i++)
	{
		int nodes = pow(2, i);
		count = 0;
		for (int j = 0; j < space; j++)
			cout << " ";
		if (i == 0)cout << "    ";
		while (q.size() && count < nodes)
		{
			if (q.front()->data == NULL)
				cout << "G" << "   ";
			else
				cout << q.front()->data << "   ";
			count++;
			node = q.front();
			q.pop();
			if (node->left)
				q.push(node->left);
			else
				q.push(Gnode);
			if (node->right)
				q.push(node->right);
			else
				q.push(Gnode);
			for (int i = 0; i < bspace; i++)
				cout << " ";
			bspace -= 1;
		}
		bspace -= 3;
		space -= 4;
		cout << endl << endl;
	}
}

//copy constructor
template<class T>
BST<T>::BST(const BST<T>& obj)
{
	stack<BSTNode<T>*> s;
	BSTNode<T>* root = obj.root;
	if (root)
	{
		s.push(root);
		while (s.size() != 0)
		{
			if (s.size())
			{
				this->insert(s.top()->data);
				root = s.top();
				s.pop();
			}
			if (root->right)
				s.push(root->right);
			if (root->left)
				s.push(root->left);
		}
	}
}

//recursive version of the destuctor
template<class T>
void BST<T>::destructor(BSTNode<T>* root)
{
	if (!root)
		return;
	destructor(root->left);
	destructor(root->right);
	delete root;
}

//deleting all nodes
template<class T>
BST<T>::~BST()
{
	destructor(this->root);
}