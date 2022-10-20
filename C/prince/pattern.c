// hackerEarthQuestion link-https://www.hackerearth.com/problem/algorithm/pattern/?
#include <stdio.h>

int main(){
	int num,i,j;
	scanf("%d", &num);              	                  // Reading input from STDIN 
for(i=1;i<=num;i++)
{
	if(i==1||i==num)
	{ for(j=1;j<=num;j++)
	    {printf("*");
		}
	}
	else
	{
		for(j=1;j<=num-i;j++)
		{
			printf(" ");
		}
		printf("*");
	}
	printf("\n");
}
	     // Writing output to STDOUT
}
