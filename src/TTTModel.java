/**
 * Created by mat on 6/28/16.
 */
public class TTTModel {

  private static final char PLAYER_1 = 'X';
  private static final char PLAYER_2 = 'O';
  private static final int BOARD_SIZE = 3;

  char[][] myBoardArray;
  char myCurrentPlayer;

  boolean isWon;

  public TTTModel() {
    myBoardArray = new char[BOARD_SIZE][BOARD_SIZE];
    myCurrentPlayer = PLAYER_1;
    isWon = false;
  }

  public char[][] getBoardArray() {
    return myBoardArray;
  }

  public char getCurrentPlayer() {
    return myCurrentPlayer;
  }


}
