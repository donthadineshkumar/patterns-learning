package patterns.creational.prototype.model;

/**
 * Date: 10/5/13
 * Time: 12:08 PM
 */
public class Engine implements Cloneable {
    private int power;

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println(String.format("Cloning engine %s ... ", power));
        return super.clone();
    }

    public Engine(int power) {
        System.out.println(String.format("Constructing engine %s ...", power));
        this.power = power;
        //simulation of very difficult constructing
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
