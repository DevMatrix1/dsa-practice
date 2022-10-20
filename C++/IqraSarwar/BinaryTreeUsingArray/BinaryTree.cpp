#include "BinaryTree.h"

template<class T>
BinaryTree<T>::BinaryTree(int h)
{
    this->height = h;
    int size = pow(2, h) - 1;
    data = new T[size];
    status = new bool[size];
    for (int i = 0; i < size; i++)
        status[i] = false;
}
template<class T>
BinaryTree<T>::~BinaryTree()
{
    if (data != nullptr)
    {
        delete[] data;
        data = nullptr;
    }
    if (status != nullptr)
    {
        delete[] status;
        status = nullptr;
    }
}
template<class T>
void BinaryTree<T>::setRoot(T val)
{
    data[0] = val;
    status[0] = true;
}
template<class T>
T BinaryTree<T>::getRoot()
{
    if (height)
        return data[0];
}
template<class T>
void BinaryTree<T>::setLeftChild(T parent, T val)
{
    int size = pow(2, height) - 1;
    int index = 0;
    for (int i = 0; i < size; i++)
    {
        if (data[i] == parent && status[(2 * i) + 1] == false)
        {
            index = i;
            break;
        }
    }
    if (index>=0)
    {
        data[(2 * index) + 1] = val;
        status[(2 * index) + 1] = true;
    }
    else
    {
        cout << "Parent Doesn't Exist!" << endl;
    }
}
template<class T>
void BinaryTree<T>::setRightChild(T parent, T val)
{
    int size = pow(2, height) - 1;
    int index = 0;
    for (int i = 0; i < size; i++)
    {
        if (data[i] == parent && status[(2 * i) + 2] == false)
        {
            index = i;
            break;
        }
    }
    if (index>=0)
    {
        data[(2 * index) + 2] = val;
        status[(2 * index) + 2] = true;
    }
    else
    {
        cout << "Parent Doesn't Exist!" << endl;
    }
}
template<class T>
int BinaryTree<T>::getParent(int node)
{
    int index = -1;
    if (node % 2 == 0)
    {
        index = (node - 2) / 2;
    }
    else if (node % 2 != 0)
    {
        index = (node - 1) / 2;
    }
    if (index >= 0)
        return index;
    else
    {
        cout << "Parent Doesn't Exist!" << endl;
        return -1;
    }
}
template<class T>
int BinaryTree<T>::getLeftChild(int par)
{
    if (status[(2 * par) + 1])
        return data[(2 * par) + 1];
    else
    {
        cout << "Parent Doesn't Exist!" << endl;
        return -1;
    }
}
template<class T>
int BinaryTree<T>::getRightChild(int par)
{
    if (status[(2 * par) + 2])
        return data[(2 * par) + 2];
    else
    {
        cout << "Parent Doesn't Exist!" << endl;
        return -1;
    }
}
template<class T>
void BinaryTree<T>::remove(T node)
{
    int size = pow(2, height) - 1;
    int index = 0;
    for (int i = 0; i < size; i++)
    {
        if (data[i] == node)
            index = i;
    }
    stack<int> s;
    if (status[index])
    {
        s.push(index);
        while (s.size() != 0)
        {
            index = (2 * index) + 1;
            while (index < size)
            {
                if (status[index])
                {
                    s.push(index);
                    index = (2 * index) + 1;
                }
                else
                    break;
            }
            index = (index - 1) / 2;
            while (index < size)
            {
                if ((2 * index) + 2 < size)
                {
                    if (status[(2 * index) + 2] == 1)
                    {
                        s.push((2 * index) + 2);
                        index = (2 * index) + 2;
                        break;
                    }
                }
                if (s.size() != 0)
                {
                    status[s.top()] = 0;
                    s.pop();
                    if (s.size() != 0)
                        index = s.top();
                    else
                        break;
                }
                else
                    break;
            }
        }
    }
}
template<class T>
void BinaryTree<T>::preOrder()
{
    stack<int> s;
    int index = 0;
    int size = pow(2, height) - 1;
    if (status[index])
    {
        s.push(index);
        while (s.size() != 0)
        {
            cout << data[s.top()] << " ";
            index = s.top();
            s.pop();
            int left = (2 * index) + 1;
            int right = (2 * index) + 2;
            if (status[right] && right < size)
            {
                s.push(right);
            }
            if (status[left] && left < size)
            {
                s.push(left);
            }
        }
    }
}
template<class T>
void BinaryTree<T>::postOrder()
{
    stack<int> s;
    stack<int> stat;
    int index = 0;
    int size = (pow(2, height) - 1);
    if (status[index])
    {
        s.push(index);
        while (s.size() != 0)
        {
            index = (2 * index) + 1;
            while (index < size)
            {
                if (status[index])
                {
                    s.push(index);
                    index = (2 * index) + 1;
                }
                else
                    break;
            }
            index = (index - 1) / 2;
            while (index < size)
            {
                if ((2 * index) + 2 < size)
                {
                    if (status[(2 * index) + 2] == 1)
                    {
                            s.push((2 * index) + 2);
                            index = (2 * index) + 2;
                            break;
                    }
                }
                if (status[index])
                    cout << data[index] << " ";
                if (s.size() != 0)
                {
                    status[s.top()] = 0;
                    stat.push(s.top());
                    s.pop();
                    if (s.size() != 0)
                        index = s.top();
                    else
                        break;
                }
                else
                    break;
            }
        }
    }
    while (stat.size())
    {
        status[stat.top()] = 1;
        stat.pop();
    }
}
template<class T>
void BinaryTree<T>::inOrder()
{
    stack<int> s;
    stack<int> stat;
    int index = 0;
    int size = pow(2, height) - 1;
    if (status[index])
    {
        s.push(index);
        while (s.size() != 0)
        {
            index = (2 * index) + 1;
            while (index < size)
            {
                if (status[index])
                {
                    s.push(index);
                    index = (2 * index) + 1;
                }
                else
                    break;
            }
            index = (index - 1) / 2;
            while (index < size)
            {
                if (status[index])
                {
                    cout << data[index] << " ";
                    status[index] = 0;
                    stat.push(index);
                }
                    
                if ((2 * index) + 2 < size)
                {
                    if (status[(2 * index) + 2])
                    {
                        s.push((2 * index) + 2);
                        index = (2 * index) + 2;
                        break;
                    }
                }
                if (s.size() != 0)
                {
                    s.pop();
                    if (s.size() != 0)
                        index = s.top();
                    else
                        break;
                }
                else
                    break;
            }
        }
    }
    while (stat.size())
    {
        status[stat.top()] = 1;
        stat.pop();
    }
}
template<class T>
void BinaryTree<T>::levelOrder()
{
    queue<int> q;
    int size = pow(2, height) - 1;
    int index = 0;
    if (status[index])
    {
        q.push(index);
        while (q.size() != 0)
        {
            cout << data[q.front()] << " ";
            index = q.front();
            q.pop();
            int left = (2 * index) + 1;
            int right = (2 * index) + 2;
            if (status[left] && left < size)
            {
                q.push(left);
            }
            if (status[right] && right < size)
            {
                q.push(right);
            }
        }
    }
}
template<class T>
void BinaryTree<T>::displayAncestors(T node)
{
    int size = pow(2, height) - 1;
    int index = 0;
    stack<int> s;
    for (int i = 0; i < size; i++)
    {
        if (data[i] == node)
            index = i;
    }
    while (index > 0)
    {
        if (index % 2 == 0)
        {
            index = (index - 2) / 2;
            s.push(index);
        }
        if (index % 2 != 0)
        {
            index = (index - 1) / 2;
            s.push(index);
        }
    }
    while (s.size())
    {
        cout << data[s.top()] << " ";
        s.pop();
    }
}
template<class T>
void BinaryTree<T>::displayDescendents(T node)
{
    int size = pow(2, height) - 1;
    int index = 0;
    queue<int> q;
    for (int i = 0; i < size; i++)
    {
        if (data[i] == node)
            index = i;
    }
    if (status[index])
    {
        q.push(index);
        while (q.size())
        {
            index = q.front();
            q.pop();
            int left = (2 * index) + 1;
            int right = (2 * index) + 2;
            if (status[left] && left < size)
            {
                q.push(left);
            }
            if (status[right] && right < size)
            {
                q.push(right);
            }
            if (q.size())
                cout << data[q.front()] << " ";
        }
    }

}
template<class T>
bool BinaryTree<T>::isPerfectTree()
{
    int count = 0;
    queue<int> q;
    int size = pow(2, height) - 1;
    int index = 0;
    if (status[index])
    {
        q.push(index);
        while (q.size() != 0)
        {
            if (status[q.front()])
                count++;
            index = q.front();
            q.pop();
            int left = (2 * index) + 1;
            int right = (2 * index) + 2;
            if (status[left] && left < size)
            {
                q.push(left);
            }
            if (status[right] && right < size)
            {
                q.push(right);
            }
        }
    }
    if (count == (pow(2, height) - 1))
    {
        return true;
    }
    return false;
}
template<class T>
bool BinaryTree<T>::iscompleteTree()
{
    int size = pow(2, height) - 1;
    int allNodes = pow(2, height - 1) - 1;
    for (int i = 0; i < allNodes; i++)
    {
        if (status[i] != true)
            return false;
    }
    int end = 0;
    for (int i = allNodes; i < size; i++)
    {
        if (status[i] == true)
        {
            if (end == 0)
                continue;
            else
                return false;
        }
        else
            end = 1;
    }
    return true;
}
