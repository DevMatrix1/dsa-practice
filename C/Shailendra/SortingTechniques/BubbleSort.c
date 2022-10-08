#include <stdio.h>
#include <stdlib.h>
void BubbleSort(int *a, int n)
{
    int temp;
    int flag = 0;
    for (int i = 0; i < n - 1; i++)
    {
        flag = 0;
        for (int j = 0; j < n - i; j++)
        {
            if (a[j] > a[j + 1])
            {
                temp = a[j + 1];
                a[j + 1] = a[j];
                a[j] = temp;
                flag = 1;
            }
        }
        if (flag == 0)
            break;
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
        printf("%d-->", arr[i]);

    BubbleSort(arr, n);
    printf("\nAfter Swap\n");
    for (int i = 0; i < n; i++)
        printf("%d-->", arr[i]);
    return 0;
}