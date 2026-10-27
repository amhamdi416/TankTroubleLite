package tanktroublelite.strategy;

/*Created MovementStrategy interface which defines the methods
   used to determine a tank's horizontal and vertical movement
   which will allow other strategy classes to implement and override
   the movement, such as BasicLeftMovementStrategy and BasicRightMovementStrategy */
public interface MovementStrategy {
    /*
     * Returns how far a tank should move horizontally this turn
     * (negative is left, positive is right, 0 is no horizontal movement).
     * Each strategy implements this to define its own horizontal behavior.
     */
    int getXMove();

    /*
     * Returns how far a tank should move vertically this turn
     * (negative is up, positive is down, 0 is no vertical movement).
     * Each strategy implements this to define its own vertical behavior.
     */
    int getYMove();
}