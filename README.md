MILRapp (or Annoying Puzzle) is an android application made by BADEA Ionut-Teodor ; NICOLESCU Matei ; POPA Stefania-Lorena and STAN Ruxandra Maria which is purposely made with a bad user interface and little bugs so it annoys the players.

The application is fairly simple, it has only buttons and TextViews which we are manipulated using the setOnClickListener() functions of the buttons.

The application has only 3 Layouts, but it can always be improved.

We used Java for this app, it contains just variables and if statements and that's it, hope you like it.

Steps to win:

1. First Layout has a hardcoded login in which the username and password are "admin" and "admin". It makes reference to the old days when most of the people used admin as password or username
2. The second Layout has 3 buttons 1 TextView as Title and 2 Hidden TextViews (one for the score ; one for the hint)
3. The "Play" button increases the score by 1, the "Start" button decreases the score by 1. The trick is that if the same button is pressed consecutively it no longer affect the score.
4. The hint displays a text which tells you about a character in a movie and his actor => which is the villain from the movie Friday 13th, so the player must reach the 13 score to win, but the hint button will set the score to -49.
5. The player can press the back button of the Android phone and enter the solution for the 1st Layout and he/she will have a score of 0 with the hint already in mind.
6. The last trick is that after reaching 13 by using the "Play" button nothing will happen. The player can win only if he reaches the score of 13 using the "Start" button. (Ex: The player is at 12 he is pressing 1 time Play the score will go to 13 but he/she must press again Play (Score 14) and than Start (Score 13 => Win).
7. The game has lose conditions as well => if the player reaches the score 30 or -51 the buttons disappear and he must press the back button to restart the level.

The game is childish but it was fun to make and we hope you will enjoy it.
