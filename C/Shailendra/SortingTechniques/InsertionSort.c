#include <stdio.h>
#include <stdlib.h>

void InsertionSort(int a[], int n)
{
    int j, x;

    for (int i = 1; i < n; i++)
    {
        j = i - 1;
        x = a[i];
        while (j > -1 && a[j] > x)
        {
            a[j + 1] = a[j];
            j--;
        }
        a[j + 1] = x;
    }
}

int main()
{
    int *arr, n;
    printf("Enter Size of Array : ");
    scanf("%d", &n);
    arr = (int *)malloc(n * sizeof(int));
    for (int k = 0; k < n; k++)
        scanf("%d", &arr[k]);
    printf("Before Swap\n");
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);

    InsertionSort(arr, n);
    printf("\nAfter Swap\n");
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    return 0;
}