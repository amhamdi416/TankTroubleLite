package tanktroublelite;

import org.junit.jupiter.api.Test;
import tanktroublelite.maze.Maze;
import tanktroublelite.maze.MazeBuilder;
import tanktroublelite.strategy.BasicRightMovementStrategy;
import tanktroublelite.strategy.BasicLeftMovementStrategy;
import tanktroublelite.strategy.MovementStrategy;
import tanktroublelite.tank.Tank;

import static org.junit.jupiter.api.Assertions.*;

class TankTest {

    @Test
    void testTankMovesRightIntoOpenCell() {
        Maze maze = new MazeBuilder(10, 10).build();
        MovementStrategy moveRight = new BasicRightMovementStrategy();

        Tank tank = new Tank(1, 1, moveRight);
        tank.move(maze);

        assertEquals(2, tank.getX());
        assertEquals(1, tank.getY());
    }

    @Test
    void testTankMovesLeftIntoOpenCell() {
        Maze maze = new MazeBuilder(10, 10).build();
        MovementStrategy moveLeft = new BasicLeftMovementStrategy();

        Tank tank = new Tank(2, 1, moveLeft);
        tank.move(maze);

        assertEquals(1, tank.getX());
        assertEquals(1, tank.getY());
    }

    @Test
    void testTankCannotMoveIntoWall() {
        Maze maze = new MazeBuilder(10, 10)
                .addWall(2, 1)
                .build();
        MovementStrategy moveRight = new BasicRightMovementStrategy();

        Tank tank = new Tank(1, 1, moveRight);
        tank.move(maze);

        assertEquals(1, tank.getX());
        assertEquals(1, tank.getY());
    }
}

