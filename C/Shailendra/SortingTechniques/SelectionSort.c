#include <stdlib.h>
#include <stdio.h>

void swap(int *x, int *y)
{
    int temp;
    temp = *x;
    *x = *y;
    *y = temp;
}
void SelectionSort(int a[], int n)
{
    int i, j, k, temp;
    for (i = 0; i < n - 1; i++)
    {
        for (j = k = i; j < n; j++)
        {
            if (a[j] < a[k])
                k = j;
        }
        // swap(&a[i], &a[k]);
        temp = a[i];
        a[i] = a[k];
        a[k] = temp;
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

    SelectionSort(arr, n);
    printf("\nAfter Swap\n");
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    return 0;
}