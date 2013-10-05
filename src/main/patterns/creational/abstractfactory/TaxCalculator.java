package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.impl.Car;

/**
 * Date: 9/28/13
 * Time: 12:41 PM
 */
public interface TaxCalculator {
    double calculate(Car car);
}
