package patterns.abstractfactory.impl.eu;

import patterns.abstractfactory.BodyTaxCalculator;
import patterns.abstractfactory.impl.Car;

/**
 * Date: 9/28/13
 * Time: 12:46 PM
 */
public class EuropeBodyTaxCalculator implements BodyTaxCalculator {

    private static final double BODY_TAX = 0.125;

    @Override
    public double calculate(Car car) {
        return car.getPrice() * car.getBodyWeight() / 1000 * BODY_TAX;
    }
}
