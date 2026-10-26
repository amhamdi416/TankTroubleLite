package tanktroublelite.tank;

import tanktroublelite.maze.Maze;
import tanktroublelite.strategy.MovementStrategy;

/*Created Tank class which stores the tank's position and uses
   a movement strategy to move while avoiding walls and maze boundaries */
public class Tank {
    private int x;
    private int y;
    private final MovementStrategy movementStrategy;

    public Tank(int x, int y, MovementStrategy movementStrategy) {
        this.x = x;
        this.y = y;
        this.movementStrategy = movementStrategy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(Maze maze) {
        int newX = x + movementStrategy.getXMove();
        int newY = y + movementStrategy.getYMove();

        if (maze.canMoveTo(newX, newY)) {
            x = newX;
            y = newY;
        }
    }
}

