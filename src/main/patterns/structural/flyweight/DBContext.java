package patterns.structural.flyweight;

/**
 * Date: 10/26/13
 * Time: 1:18 PM
 */
public class DBContext implements Context {
    @Override
    public int getNumberOfConnections() {
        return 10;
    }
}
