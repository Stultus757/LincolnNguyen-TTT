class Game{
  // ---------------------- properties -----------------------
private int[][]state;
private int winner;
  // ---------------------- constructor ----------------------
  public  Game(int[][] state, int winner){
  this.state = state;
  this.winner = winner;
  };
  // ----------------------  methoods  -----------------------
  //Prints the state of the board
  public static void Getstate(int[][] state) {
    int k = 1;
    System.out.println("--1---2---3--");
    for (int[] i : state) {
      System.out.print(k);
      for (int j : i) {
        if(j == 1){
          System.out.print(" X ");
        }
        else if(j == 2){
          System.out.print(" O ");
        }
        else{
          System.out.print(" _ ");
        }
        System.out.print("|");
      }
      System.out.println();
      System.out.println("-------------");
      k = k + 1;
    }
  }
  
  //Checkwinner: Checks for Horizontal, Diagonal, or Vertical wins
  //Should pass every single time a turn is run, returns int winner
  //int winner should pass 0 if no winner, but 1 or 2 if any scenario won dependent on if 
  //X or if O is found. Check draw should be in this.
  //CheckDraw: Checks for a draw. If every tile on the board does not equal 0, then winner 
  //will return 3, and the draw dialouge is called in main


}