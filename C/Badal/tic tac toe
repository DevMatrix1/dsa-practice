#include <stdio.h>
#include <conio.h>
char square[10] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

int choice, player;
int checkforwin ();
void displayboard ();
void markboard (char mark);
int
main ()
{
  int gamestatus;
  char mark;
  player = 1;
  do
    {
      displayboard ();
      player = (player % 2) ? 1 : 2;
      printf ("Player %d, Enter a number:", player);
      scanf ("%d", &choice);
      mark = player == 1 ? 'X' : 'O';
      markboard (mark);
      gamestatus = checkforwin ();
      player++;
    }
  while (gamestatus == -1);
  if (gamestatus==1)
    { printf("player %d wins",--player);
    }
else 
    printf("Game Draw");

  return 0;
}

int checkforwin ()
{
  int returnvalue = 0;
  if (square[1] == square[2] && square[2] == square[3])
    {
      returnvalue = 1;
    }
 
  else if (square[4] == square[5] && square[5] == square[6])
    returnvalue = 1;
  else if (square[1] == square[5] && square[5] == square[9])
    returnvalue = 1;

  else if (square[3] == square[5] && square[5] == square[7])
    returnvalue = 1;
    
  else if (square[7] == square[8] && square[8] == square[9])
    returnvalue = 1;
    
  else if (square[1] == square[4] && square[7] == square[4])
    returnvalue = 1;

  else if (square[2] == square[5] && square[8] == square[5])
    returnvalue = 1;

  else if (square[3] == square[6] && square[6] == square[9])
    returnvalue = 1;
    
    else if (square[1] != '1' && square[2] != '2' && square[3] != '3' &&
      	   square[4] != '4' && square[5] != '5' && square[6] != '6' &&
	       square[7] != '7' && square[8] != '8' && square[9] != '9')
           {returnvalue = 0;}
       else
          returnvalue=-1;
  

 

  return returnvalue;
}

void
displayboard ()
{
  system("cls");
  printf ("\n\n  TIC TAC TOE \n\n ");
  printf ("Player1(X) Player2(O)\n\n\n");
  printf ("   |   |   \n");
  printf (" %c | %c | %c \n", square[1], square[2], square[3]);
  printf ("___|___|___\n");
  printf ("   |   |   \n");
  printf (" %c | %c | %c \n", square[4], square[5], square[6]);
  printf ("___|___|___\n");
  printf ("   |   |   \n");
  printf (" %c | %c | %c \n", square[7], square[8], square[9]);
  printf ("   |   |   \n\n");
}

void
markboard (char mark)
{
  if (choice == 1 && square[1] == '1')
    square[1] = mark;
  else if (choice == 2 && square[2] == '2')
    square[2] = mark;
  else if (choice == 4 && square[4] == '4')
    square[4] = mark;
  else if (choice == 3 && square[3] == '3')
    square[3] = mark;
  else if (choice == 5 && square[5] == '5')
    square[5] = mark;
  else if (choice == 6 && square[6] == '6')
    square[6] = mark;
  else if (choice == 7 && square[7] == '7')
    square[7] = mark;
  else if (choice == 8 && square[8] == '8')
    square[8] = mark;
  else if (choice == 9 && square[9] == '9')
    square[9] = mark;
  else
    {
      printf ("Invalid Move");
      player--;
      getch ();
    }
}
