package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.impl.Car;
import patterns.creational.abstractfactory.impl.TaxProcessor;

/**
 * Date: 9/28/13
 * Time: 12:15 PM
 */
public class Main {
    public static void main(String[] args) {
        Country country = Country.EUROPE;

        CarTaxCalculatorAbstractFactory factory = CarTaxCalculatorFactory.getFactory(country);

        Car car = new Car(23995, 2399, 1798);
        TaxProcessor taxProcessor = new TaxProcessor(factory);
        taxProcessor.processTaxes(car);
    }


}
