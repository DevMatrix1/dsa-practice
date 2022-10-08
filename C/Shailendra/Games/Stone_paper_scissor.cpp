#include <iostream>
#include <stdlib.h>
#include <time.h>
#include <conio.h>
using namespace std;
// rock paper Scissor
// 0    1       2

int main()
{
    int playerChoice = 0, computerChoice = 0;
    int playerScore = 0, computerScore = 0;
    string choice[3] = {"Rock", "Paper", "Scissor"};
    srand(time(0)); // seed random
    do
    {
        cout << "\n0:Rock 1:Paper 2:Scissor";
        cout << "\nMake A Choice:";
        cin >> playerChoice;
    } while (playerChoice > 2 || playerChoice < 0);
    // rand();
    computerChoice = rand() % 3;
    if (playerChoice == computerChoice)
        ;
    else if (playerChoice == 0 && computerChoice == 2)
        playerScore++;
    else if (computerChoice == 0 && playerChoice == 2)
        computerScore++;
    else if (playerChoice > computerChoice)
        playerScore++;
    else
        computerScore++;
    cout << "\nPlayer vs Computer\n";
    cout << choice[playerChoice] << " vs " << choice[computerChoice];

    if (playerScore == computerScore)
        cout << "\n ~~~~ Tie ~~~~";
    else if (playerScore > computerScore)
        cout << "\n ~~~~ Player Wins ~~~~";
    else
        cout << "\n ~~~~ Computer Wins";
    getch();
    return 0;
}