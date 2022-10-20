#include<stdio.h>
int main()
{
   int rows, i, j;

   printf("Enter number of rows: ");
   scanf("%d", &rows);
   
   //Triangle
   for(i = 1; i <= rows; i++)
   {
      for(j = 1; j <= rows; j++)
      {
         if(j <= rows-i){
		 	printf(" ");
		}
        else{
        	printf("* ");
		}
      }
      printf("\n");
   }
   
   printf("\n\n");
   
   //Upright triangle
   for(i = 1; i <= rows; i++)
   {
      for(j = 1; j <= rows+1; j++)
      {
         if(j <= i){
		 	printf(" ");
		}
        else{
        	printf("* ");
		}
      }
      printf("\n");
   }
   return 0;
}