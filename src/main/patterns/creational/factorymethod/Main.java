package patterns.creational.factorymethod;

import patterns.creational.abstractfactory.Country;
import patterns.creational.abstractfactory.EngineTaxCalculator;
import patterns.creational.abstractfactory.impl.Car;

/**
 * Date: 9/28/13
 * Time: 1:29 PM
 */
public class Main {
    public static void main(String[] args) {
        Country country = Country.EUROPE;

        EngineTaxCalculator engineTaxCalculator = EngineTaxCalculatorFactory.getEngineTaxCalculator(country);
        Car car = new Car(139799.99, 3.201, 2243);
        double tax = engineTaxCalculator.calculate(car);
        System.out.println(String.format("Engine tax size is %s", tax));
    }
}
