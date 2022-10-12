//link-https://practice.geeksforgeeks.org/problems/print-pattern3549/1
#include<stdio.h>
int main()
{ 
    int n,m;
    printf("Enter the element:\n");
    scanf("%d",&m);
    n=m;
    call:
    if(n<0)
    { goto mid;
    }
    else
     {
      printf("%d ",n);
      n=n-5;
      goto call;
     }
    
    mid:
      if(n>m)
      {goto down;}
      else
      { printf("%d ",n);
      n=n+5;
      goto mid;
      }
      
    
    down:
    return 0;
}
