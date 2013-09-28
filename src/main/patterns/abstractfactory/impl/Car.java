package patterns.abstractfactory.impl;

/**
 * Date: 9/28/13
 * Time: 12:53 PM
 */
public class Car {
    private final double price;
    private final double engine;
    private final double bodyWeight;

    public Car(double price, double engine, double bodyWeight) {
        this.price = price;
        this.engine = engine;
        this.bodyWeight = bodyWeight;
    }

    public double getPrice() {
        return price;
    }

    public double getEngine() {
        return engine;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }
}
