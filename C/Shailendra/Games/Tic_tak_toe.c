#include <stdio.h>
#include <string.h>

int player = 1, position;

char box[10] = {'o', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
void OutputBox();
void setMark(char);
char mark;
int GameCheck()
{
    if (box[1] == box[2] && box[2] == box[3])
        return 1;
    else if (box[4] == box[5] && box[5] == box[6])
        return 1;
    else if (box[7] == box[8] && box[8] == box[9])
        return 1;
    else if (box[1] == box[4] && box[4] == box[7])
        return 1;
    else if (box[2] == box[5] && box[5] == box[8])
        return 1;
    else if (box[3] == box[6] && box[6] == box[9])
        return 1;
    else if (box[3] == box[5] && box[5] == box[7])
        return 1;
    else if (box[1] == box[5] && box[5] == box[9])
        return 1;
    else
        return -1;
}
void setMark(char ch)
{
    if (position == 1 && box[1] == '1')
        box[1] = mark;
    else if (position == 2 && box[2] == '2')
        box[2] = mark;
    else if (position == 3 && box[3] == '3')
        box[3] = mark;
    else if (position == 4 && box[4] == '4')
        box[4] = mark;
    else if (position == 5 && box[5] == '5')
        box[5] = mark;
    else if (position == 6 && box[6] == '6')
        box[6] = mark;
    else if (position == 7 && box[7] == '7')
        box[7] = mark;
    else if (position == 8 && box[8] == '8')
        box[8] = mark;
    else if (position == 9 && box[9] == '9')
        box[9] = mark;
    else
    {
        printf("\nInvalid Move......ALERT!!!");
        player--;
    }
}
int main()
{
    int status;
    do
    {
        OutputBox();
        player = (player % 2) ? 1 : 2;
        mark = (player == 1) ? 'X' : 'O';

        printf("Player %d ,Enter the postion where you want To mark : ", player);
        scanf("%d", &position);

        setMark(mark);

        status = GameCheck();
        player++;
    } while (status == -1);
    if (status == 1)
        printf("\n\n====> PLAYER %d , WON\n", --player);

    else
        printf("\n\nMATCH DRAWN\n");

    return 0;
}
void OutputBox()
{

    system("cls"); // If you Dont want to print table after every move than uncoment it.......
    printf("\n\n\n\n\tTic Tac Toe \n\n");

    printf("Player 1 (X)  -  Player 2 (O)\n\n\n");

    printf("     |     |     \n");
    printf("  %c  |  %c  |  %c \n", box[1], box[2], box[3]);

    printf("_____|_____|_____\n");
    printf("     |     |     \n");

    printf("  %c  |  %c  |  %c \n", box[4], box[5], box[6]);

    printf("_____|_____|_____\n");
    printf("     |     |     \n");

    printf("  %c  |  %c  |  %c \n", box[7], box[8], box[9]);

    printf("     |     |     \n\n");
}