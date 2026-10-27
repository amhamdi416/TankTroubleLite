package tanktroublelite.maze;

/* Created MazeFactory class which creates preconstructed layouts using the MazeBuilder class*/
public class MazeFactory {
    /*
     * Builds a 6x6 maze with a 2x2 block of walls in the center.
     * Gives players a compact arena with a single obstacle to move around.
     */
    public Maze createSmallMaze() {
        return new MazeBuilder(6, 6)
                .addWall(2, 2)
                .addWall(3, 2)
                .addWall(2, 3)
                .addWall(3, 3)
                .build();
    }

    /*
     * Builds a 10x10 maze with no interior walls.
     * Gives players a wide open arena with nothing to hide behind.
     */
    public Maze createOpenMaze() {
        return new MazeBuilder(10, 10)
                .build();
    }

    /*
     * Builds a 10x10 maze with two staggered vertical walls that form corridors.
     * Forces players to maneuver around the walls to reach each other.
     */
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