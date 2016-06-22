import java.awt.*;

/**
 * Created by mat on 6/22/16.
 */
public interface TicTacModelInterface {

    /**
     * Takes in a point where the player made a move and changes the model.
     * @param theLocation the location of the move
     */
    public void movePlayer(Point theLocation);
}
