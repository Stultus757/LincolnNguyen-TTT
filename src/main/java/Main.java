/*

Lincoln Nguyen
Tic Tac Toe (Give me an X, give me an O) - 06
1053757 @apps.nsd.org
Reiber P5
2/16/24
--------------------------------------------------------------------------------
This project must play Tic-Tac-Toe.


For the first in-class demonstration, you must have the following:
1) a static constand 2-D Array the represnets the board and holds the STATE data for the game.
2) You must correctly resolve:
  horizontal, 
  diagonal, 
  vertical winner conditions
  And a draw
3) You must have 1 player.

For the future and more points above an A-...
0) You must correctly resolve all win and draw states
1) You should have a seond player
2) You should be able to play on a 4 x 4 board
3) You should correctly resolve turns
4) The player and the game should be in seperate classes from your static Main


For more in the future and more awesomer...
1) You can have a text file documenting player win-loss records and another stat of your choice
2) You can have a 3rd or 4th player
3) You can have a 3rd dimension to the game
4) You can make a new class for a game session as well as a single game
5) You can make a new class for a turn, or a piece, or a screen painter


*/

/*
public class Main {
  public static void main(String[] args) {
    new Player();
    System.out.println("TTT - RAN WITHOUT ERRORS");
  }
}
*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
class Main {

  //template state, reset to all tiles being 0 upon complete
  public static final int[][] ReSTATE = {
      { 2, 1, 2 },
      { 1, 1, 0 },
      { 0, 1, 2 }
  };

  public static final int[][] DSTATE = {
    {2,0,9,7},
    {1,1,2,5},
    {0,1,2,5},
    {1,3,6,1}
  };

  public static void main(String[] args) {
    Random turnchoice = new Random();
    Scanner input = new Scanner(System.in);
    int winner = 0;

    int[][] State = ReSTATE;
    int current = turnchoice.nextInt(2) + 1;
    Player PlayerX = new Player();
    Player PlayerO = new Player();
    Game ttt = new Game(ReSTATE, winner);
    //FYI: 1 = X's turn, 2 = O's turn.

    System.out.println(current);
    ttt.Getstate(ReSTATE);
    
    //code remnant for winscanning. This is for scanning top right bottom left diagonal
    /*
for(int i = 0; i <= DSTATE.length - 1; i++){
  System.out.print(DSTATE[i][(DSTATE.length - 1) - i]);
}
    */
    //main loop
    while(winner == 0){
      
    }
    System.out.print(" -=-=-=-=- FINISHED  -=-=-=-=-");
  }




  //move this to player class.
  public static void Addtoken(int current){

  }
  }