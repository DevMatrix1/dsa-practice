#include <stdio.h>
#include <stdlib.h>
void Tower(int, char, char, char);
int count = 1;
int main()
{
    int NOC;
    printf("Enter NOC:");
    scanf("%d", &NOC);

    Tower(NOC, 'A', 'B', 'C');
    return 0;
}

void Tower(int cd, char source, char aux, char destination)
{
    if (cd == 1)
    {
        printf("%c---->%c       ----%d\n", source, destination, count);
        count++;
        return;
    }

    Tower(cd - 1, 'A', 'C', 'B');
    Tower(1, 'A', 'B', 'C');
    Tower(cd - 1, 'B', 'A', 'C');
}