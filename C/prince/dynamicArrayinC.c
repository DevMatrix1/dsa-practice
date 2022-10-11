//link-https://www.hackerrank.com/challenges/dynamic-array-in-c/problem?isFullScreen=true
#include <stdio.h>
#include <stdlib.h>

/*
 * This stores the total number of books in each shelf.
 */
int* total_number_of_books;

/*
 * This stores the total number of pages in each book of each shelf.
 * The rows represent the shelves and the columns represent the books.
 */
int** total_number_of_pages;
int main()
{
    int total_number_of_shelves;
    scanf("%d", &total_number_of_shelves);
    total_number_of_books=calloc(total_number_of_shelves,sizeof(int));
    
    int total_number_of_queries;
    scanf("%d", &total_number_of_queries);
    total_number_of_pages=malloc(total_number_of_shelves*sizeof(int*));
    for(int i=0;i<total_number_of_shelves;i++)
    {
        total_number_of_pages[i]=calloc(1100,sizeof(int));
    }
    while (total_number_of_queries--) {
        int type_of_query;
        scanf("%d", &type_of_query);
        
        if (type_of_query == 1) {
            
            /*
             * Process the query of first type here.
             */
            int x, y;
            scanf("%d %d", &x, &y);
             total_number_of_books[x]++;
             
         int *books=total_number_of_pages[x];
              while(*books!=0)
                books++;
                
                
             *books=y;

        } else if (type_of_query == 2) {
