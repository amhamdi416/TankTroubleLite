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

    public Maze(int width, int height, Set<Point> walls) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Maze dimensions must be positive.");
        }

        this.width = width;
        this.height = height;
        this.walls = new HashSet<>(walls);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isWall(int x, int y) {
        return walls.contains(new Point(x, y));
    }

    public boolean isInside(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    public boolean canMoveTo(int x, int y) {
        return isInside(x, y) && !isWall(x, y);
    }
}
