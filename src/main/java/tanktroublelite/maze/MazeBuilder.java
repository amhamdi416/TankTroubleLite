package tanktroublelite.maze;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

/*Created MazeBuilder class which builds a maze by adding walls
   to the grid before creating the finished Maze object*/
public class MazeBuilder {
    private final int width;
    private final int height;
    private final Set<Point> walls = new HashSet<>();

    /*
     * Starts a new builder for a maze of the given size with no walls yet.
     * Walls are then added one at a time before build() is called.
     */
    public MazeBuilder(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /*
     * Records a wall at cell (x, y) and returns this builder.
     * Returning the builder lets calls be chained, which keeps maze layouts short and readable.
     */
    public MazeBuilder addWall(int x, int y) {
        walls.add(new Point(x, y));
        return this;
    }

    /*
     * Creates the finished Maze from the size and walls collected so far.
     * This is the last step of building a maze layout.
     */
    public Maze build() {
        return new Maze(width, height, walls);
    }
}