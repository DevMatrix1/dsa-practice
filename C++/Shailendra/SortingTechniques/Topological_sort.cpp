// #include <iostream>
#include <bits/stdc++.h>
#include <algorithm>
using namespace std;

int mat[6][6] = {
    {0, 1, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 1},
    {0, 0, 0, 0, 1, 0},
    {1, 0, 1, 0, 0, 0},
    {0, 0, 0, 0, 0, 1},
    {0, 0, 0, 0, 0, 0},
};
int indegree[6];

void Indegree(int m[][6], int n)
{
    for (int i = 0; i < n; i++)
    {
        int sum = 0;
        for (int j = 0; j < n; j++)
        {
            sum += m[j][i];
        }
        indegree[i] = sum;
    }
}

void topologicalSort(int mat[][6], int in[], int n)
{
    stack<int> s;
    int visited[n] = {0};
    int sorted[n], p = 0;
    for (int i = 0; i < n; i++)
    {
        if (in[i] == 0 && visited[i] == 0)
        {
            s.push(i);
            visited[i] = 1;
        }
    }

    while (!s.empty())
    {

        int u = s.top();
        s.pop();
        sorted[p] = u + 1;

        for (int i = 0; i < n; i++)
        {
            if (mat[u][i] == 1)
            {
                in[i]--;
            }
            if (in[i] == 0 && visited[i] == 0)
            {
                visited[i] = 1;
                s.push(i);
            }
        }
        p++;
    }

    for (int i = 0; i < n; i++)
        cout << sorted[i] << " ";
}

int main()
{
    Indegree(mat, 6);
    topologicalSort(mat, indegree, 6);
    return 0;
}