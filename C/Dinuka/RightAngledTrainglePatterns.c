#include <stdio.h>
void main(){
    int i, j, rows;
    printf("Enter the no. of rows:");
    scanf("%d", &rows);
    
    //Right angled triangle
    for (i=0; i<rows; i++){
    	for(j=i; j<rows; j++){
    		printf("*");
		}
    	printf("\n");
	}
	
	printf("\n\n");
	//Inverted right angled triangle
    for (i=1; i<=rows; i++){
    	for(j=1; j<=i; j++){
    		printf("*");
		}
    	printf("\n");
	}
	
}