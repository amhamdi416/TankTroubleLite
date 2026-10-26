package tanktroublelite;

import org.junit.jupiter.api.Test;
import tanktroublelite.maze.Maze;
import tanktroublelite.maze.MazeFactory;

import static org.junit.jupiter.api.Assertions.*;

class MazeFactoryTest {

    @Test
    void testCreatesOpenMaze() {
        Maze maze = new MazeFactory().createOpenMaze();

        assertEquals(10, maze.getWidth());
        assertEquals(10, maze.getHeight());
        assertFalse(maze.isWall(3, 3));
    }

    @Test
    void testCreatesCorridorMazeWithWalls() {
        Maze maze = new MazeFactory().createCorridorMaze();

        assertEquals(10, maze.getWidth());
        assertEquals(10, maze.getHeight());
        assertTrue(maze.isWall(3, 1));
        assertTrue(maze.isWall(6, 7));
        assertFalse(maze.isWall(0, 0));
    }

    @Test
    void testCreatesSmallMaze() {
        Maze maze = new MazeFactory().createSmallMaze();

        assertEquals(6, maze.getWidth());
        assertEquals(6, maze.getHeight());
        assertTrue(maze.isWall(2, 2));
        assertTrue(maze.isWall(3, 3));
        assertFalse(maze.isWall(0, 0));
    }
}

