package patterns.abstractfactory.impl.eu;

import patterns.abstractfactory.EngineTaxCalculator;
import patterns.abstractfactory.impl.Car;

/**
 * Date: 9/28/13
 * Time: 12:45 PM
 */
public class EuropeEngineTaxCalculator implements EngineTaxCalculator {

    private static final double ENGINE_TAX = 5.25;

    @Override
    public double calculate(Car car) {
        return car.getPrice() * car.getEngine() / 1000 * ENGINE_TAX;
    }
}
