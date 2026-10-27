package tanktroublelite.maze;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

/*Created Maze class which creates the maze grid, adds walls to the grid,
   and checks whether a cell is inside the maze or can be moved to*/
public class Maze {
    private final int width;
    private final int height;
    private final Set<Point> walls;
    /*
     * Creates a maze of the given size and stores a copy of the wall positions.
     * Rejects non-positive dimensions, and copying the walls keeps the maze from
     * being changed later by whoever passed the set in.
     */
    public Maze(int width, int height, Set<Point> walls) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Maze dimensions must be positive.");
        }

        this.width = width;
        this.height = height;
        this.walls = new HashSet<>(walls);
    }
    /*Returns the number of columns in the maze grid. */
    public int getWidth() {
        return width;
    }
    /*Returns the number of rows in the maze grid. */
    public int getHeight() {
        return height;
    }
    /*Returns true if the cell at (x, y) contains a wall.*/
    public boolean isWall(int x, int y) {
        return walls.contains(new Point(x, y));
    }
    /*Returns true if (x, y) is within the maze's boundaries. */
    public boolean isInside(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }
    /*
     * Returns true if a tank is allowed to enter the cell at (x, y),
     * meaning the cell is inside the maze and is not a wall.
     * This is the main check Tank uses before it moves.
     */
    public boolean canMoveTo(int x, int y) {
        return isInside(x, y) && !isWall(x, y);
    }
}
