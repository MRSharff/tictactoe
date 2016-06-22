/**
 * Created by mat on 6/22/16.
 */
public interface TicTacViewInterface {

    public void playerMove(int thePosition, char thePlayer);
    public void gameTie();
    public void gameWon(char theWinner);

}
