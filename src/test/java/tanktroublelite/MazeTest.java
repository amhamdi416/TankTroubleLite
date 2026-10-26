package tanktroublelite;

import org.junit.jupiter.api.Test;
import tanktroublelite.maze.Maze;
import tanktroublelite.maze.MazeBuilder;

import static org.junit.jupiter.api.Assertions.*;

class MazeTest {

    @Test
    void testMazeHasCorrectDimensions() {
        Maze maze = new MazeBuilder(10, 8).build();

        assertEquals(10, maze.getWidth());
        assertEquals(8, maze.getHeight());
    }

    @Test
    void testBuilderAddsWall() {
        Maze maze = new MazeBuilder(10, 10)
                .addWall(3, 4)
                .build();

        assertTrue(maze.isWall(3, 4));
    }

    @Test
    void testOpenCellCanBeReached() {
        Maze maze = new MazeBuilder(10, 10).build();

        assertTrue(maze.canMoveTo(2, 2));
    }

    @Test
    void testCannotMoveOutsideMaze() {
        Maze maze = new MazeBuilder(10, 10).build();

        assertFalse(maze.canMoveTo(-1, 0));
        assertFalse(maze.canMoveTo(10, 0));
    }

    @Test
    void testRejectsInvalidDimensions() {
        assertThrows(IllegalArgumentException.class, () ->
                new Maze(0, 10, java.util.Set.of()));

        assertThrows(IllegalArgumentException.class, () ->
                new Maze(10, -1, java.util.Set.of()));
    }
}

