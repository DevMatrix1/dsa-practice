#include <iostream>
using namespace std;

void merging(int arr[], int l, int mid, int h)
{
    int i, j, k, b[100];
    i = l;
    j = mid + 1;
    k = l;

    while (i <= mid && j <= h)
    {
        if (arr[i] < arr[j])
            b[k++] = arr[i++];
        else
            b[k++] = arr[j++];
    }

    for (; i <= mid; i++)
        b[k++] = arr[i];

    for (; j <= h; j++)
        b[k++] = arr[j];

    for (i = l; i <= h; i++)
        arr[i] = b[i];
}

// recursive...........
void mergeSort(int arr[], int l, int h)
{
    int mid;
    if (l < h)
    {
        mid = (l + h) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, h);
        merging(arr, l, mid, h);
    }
}

// Iterative.................

// void mergeSort(int arr[],int n)
// {

//     int p , i ,l,mid , h;
//     for(p=2 ; p<=n ; p=p*2)
//     {
//         for(i = 0 ; i+p-1<n ; i = i+p)
//         {
//             l = i ;
//             h = i+p-1;
//             mid = (l+h)/2;
//             merging(arr,l,mid,h);

//         }
//     }
//     if(p/2<n)
//     merging(arr,0,p/2-1,n);

// // }

int main()
{
    int n;
    cout << "Enter size : ";
    cin >> n;
    int arr[n];

    for (int i = 0; i < n; i++)
        cin >> arr[i];
    mergeSort(arr, 0, n - 1);

    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";

    return 0;
}
