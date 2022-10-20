#include <stdio.h>

void swap(int *x, int *y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}

int partition(int a[], int l, int r)
{
    int pivot = a[r];
    int i = l - 1, j;
    for (j = l; j < r; j++)
    {
        if (a[j] < pivot)
        {
            i++;
            swap(&a[i], &a[j]);
        }
    }
    swap(&a[i + 1], &a[r]);
    return i + 1;
}

void quicksort(int a[], int l, int r)
{
    if (l < r)
    {
        int pivot = partition(a, l, r);
        quicksort(a, l, pivot - 1);
        quicksort(a, pivot + 1, r);
    }
}

int main()
{
    int arr[] = {5, 1, 3, 4, 6};
    int r = sizeof(arr) / sizeof(arr[0]);
    quicksort(arr, 0, r - 1);

    for (int i = 0; i < r; i++)
        printf("%d ", arr[i]);
    return 0;
}