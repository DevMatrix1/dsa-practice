//link-https://practice.geeksforgeeks.org/problems/triangle-shrinking-downwards0459/1
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void main()
{   int i,j,k,l;
    char line[100]="GEEKS";
    l= strlen(line);
    for(i=1;i<=l;i++)
    { k=i-1;
        for(j=1;j<=i-1;j++)
        {
            printf(".");
        }
        for(j=1;j<=l+1-i;j++)
        {
            printf("%c",line[k]);
            k++;
        }
        printf("\n");
    }
}
