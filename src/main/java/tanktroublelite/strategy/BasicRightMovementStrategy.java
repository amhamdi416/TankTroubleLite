package tanktroublelite.strategy;

public class BasicRightMovementStrategy implements MovementStrategy {
    /*
     * Returns 1 so the tank moves one cell to the right (increasing x) each turn.
     * This is the horizontal part of the always-move-right behavior.
     */
    @Override
    public int getXMove() {
        return 1;
    }

    /*
     * Returns 0 so the tank never moves vertically.
     * This keeps the tank travelling along a straight horizontal line.
     */
    @Override
    public int getYMove() {
        return 0;
    }
}