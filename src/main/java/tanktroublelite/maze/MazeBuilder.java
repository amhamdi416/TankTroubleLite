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

    public MazeBuilder(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public MazeBuilder addWall(int x, int y) {
        walls.add(new Point(x, y));
        return this;
    }

    public Maze build() {
        return new Maze(width, height, walls);
    }
}

