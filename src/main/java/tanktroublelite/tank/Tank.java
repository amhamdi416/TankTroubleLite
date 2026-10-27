package tanktroublelite.tank;

import tanktroublelite.maze.Maze;
import tanktroublelite.strategy.MovementStrategy;

/*Created Tank class which stores the tank's position and uses
   a movement strategy to move while avoiding walls and maze boundaries */
public class Tank {
    private int x;
    private int y;
    private final MovementStrategy movementStrategy;

    /*
     * Creates a tank at the starting cell (x, y) that moves according to the given strategy.
     * Passing in the strategy lets different tanks behave differently without changing this class.
     */
    public Tank(int x, int y, MovementStrategy movementStrategy) {
        this.x = x;
        this.y = y;
        this.movementStrategy = movementStrategy;
    }

    /* Returns the tank's current column in the maze. */
    public int getX() {
        return x;
    }

    /* Returns the tank's current row in the maze.  */
    public int getY() {
        return y;
    }

    /*
     * Moves the tank one step as directed by its movement strategy, but only if the
     * destination cell is inside the maze and not a wall; otherwise the tank stays put.
     * This is how tanks are kept from driving through walls or off the grid.
     */
    public void move(Maze maze) {
        int newX = x + movementStrategy.getXMove();
        int newY = y + movementStrategy.getYMove();

        if (maze.canMoveTo(newX, newY)) {
            x = newX;
            y = newY;
        }
    }
}