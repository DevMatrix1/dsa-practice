// link- https://www.hackerrank.com/challenges/printing-pattern-2/problem

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    int n,i,j,k,l,a,b=0;
    scanf("%d", &n);
  	// Complete the code to print the pattern. 
      
       for(i=n;i>0;i--)
 { j=n;
   k=1;
   l=i;
   b=b+1;
   a=(2*n-1)-(2*b);
    while(j>=i)
    { printf("%d ",j);
     j--;
     } 
    while(k<=a)
    {
     k=k+1;
     printf("%d ",i); 
    }
    
    while(l<=n)
    { if(l==1)
     l=1;
    else 
     printf("%d ",l);
     
     l++;
    }
    printf("\n");
    
 }
b=b-1;
for(i=2;i<=n;i++)
{j=n;
 k=3;
 l=i;
 b=b-1;
 a=(2*n-1)-(2*b);
 while(j>=i)
 
{ printf("%d ",j);
j--;
}
while(k<=a)
{ k=k+1;
    printf("%d ",i);
}
while(l<=n)
{
  printf("%d ",l);
  l++;
}
printf("\n");

}
    return 0;
}
