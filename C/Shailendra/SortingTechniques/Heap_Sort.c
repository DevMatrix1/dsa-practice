#include <stdio.h>

void insert(int A[], int n)
{
    int temp, i = n;
    temp = A[n];

    while (i > 1 && temp > A[i / 2])
    {
        A[i] = A[i / 2];
        i = i / 2;
    }
    A[i] = temp;
}

void delete (int A[], int last)
{
    int temp = A[last];
    int val = A[1];

    A[1] = A[last];
    A[last] = val;

    int i = 1, j = 2 * i;

    while (j < last - 1)
    {
        if (A[j + 1] > A[j])
            j = j + 1;

        if (A[i] < A[j])
        {
            int x = A[i];
            A[i] = A[j];
            A[j] = x;

            i = j;
            j = 2 * i;
        }

        else
            break;
    }
}
void printHeap(int H[], int n)
{
    for (int i = 1; i < n; i++)
        printf("%d ", H[i]);
    printf("\n\n");
}
int main()
{
    int H[] = {0, 14, 15, 5, 20, 30, 8, 40};
    int n = sizeof(H) / sizeof(H[0]);
    for (int i = 2; i < n; i++)
        insert(H, i);

    printf("Created Heap\n");
    printHeap(H, n);

    for (int i = 1; i < n; i++)
        delete (H, n - i);

    printf("Sorted Heap\n");
    printHeap(H, n);

    return 0;
}