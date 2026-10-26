package tanktroublelite.strategy;

/*Created MovementStrategy interface which defines the methods
   used to determine a tank's horizontal and vertical movement
   which will allow other strategy classes to implement and override
   the movement, such as BasicLeftMovementStrategy and BasicRightMovementStrategy */
public interface MovementStrategy {
    int getXMove();
    int getYMove();
}
