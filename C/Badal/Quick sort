#include<stdio.h>
  int  n;
  int  main()
  {
  int arr[30],l,r,i;
  void quick_sort(int arr[],int,int);
  printf("\nInput number of elements:  ");
  scanf(" %d",&n);
  printf("\nInput  array values one by one: ");
  for(i=0;i<n;i++)
  scanf(" %d",&arr[i]);
  l=0; r=n-1;
  quick_sort(arr,l,r);
  printf("\nThe quick sorted array is:  ");
  for(i=0;i<n;i++)
  printf(" %d",arr[i]);
  printf("\n");
  }
  void quick_sort(int arr[],int low,int high)
  {
  int temp,left,right,x,k;
  if(low>=high)
  return;
  else
  {
  x=arr[low];
  right=low+1;
  left = high;
  while(right<=left)
  {
  while(arr[right]<x && right  <= high)
  {
  right ++;
  }
  while(arr[left]>x && left >  low)
  {
  left--;
  }
  if(right<left)
  {
  temp=arr[right];
  arr[right]=arr[left];
  arr[left]=temp;
  right++;
  left--;
  }
  }
  arr[low]=arr[left];
  arr[left]=x;
  quick_sort(arr,low,left-1);
  quick_sort(arr,left+1,high);
  }
  }
