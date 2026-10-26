package tanktroublelite.maze;

/* Created MazeFactory class which creates preconstructed layouts using the MazeBuilder class*/
public class MazeFactory {
    public Maze createSmallMaze() {
        return new MazeBuilder(6, 6)
                .addWall(2, 2)
                .addWall(3, 2)
                .addWall(2, 3)
                .addWall(3, 3)
                .build();
    }

    public Maze createOpenMaze() {
        return new MazeBuilder(10, 10)
                .build();
    }

    public Maze createCorridorMaze() {
        return new MazeBuilder(10, 10)
                .addWall(3, 1)
                .addWall(3, 2)
                .addWall(3, 3)
                .addWall(3, 4)
                .addWall(3, 5)
                .addWall(6, 4)
                .addWall(6, 5)
                .addWall(6, 6)
                .addWall(6, 7)
                .build();
    }
}

