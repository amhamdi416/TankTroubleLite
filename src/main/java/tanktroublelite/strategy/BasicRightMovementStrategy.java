package tanktroublelite.strategy;

public class BasicRightMovementStrategy implements MovementStrategy {
    @Override
    public int getXMove() {
        return 1;
    }

    @Override
    public int getYMove() {
        return 0;
    }
}
