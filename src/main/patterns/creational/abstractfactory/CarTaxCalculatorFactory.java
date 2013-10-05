package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.impl.eu.EuropeCarTaxCalculatorAbstractFactory;
import patterns.creational.abstractfactory.impl.uk.UkraineCarTaxCalculatorAbstractFactory;
import patterns.creational.abstractfactory.impl.us.UsaCarTaxCalculatorAbstractFactory;

/**
 * Date: 9/28/13
 * Time: 1:31 PM
 */
public class CarTaxCalculatorFactory {
    public static CarTaxCalculatorAbstractFactory getFactory(Country country) {
        CarTaxCalculatorAbstractFactory factory;
        switch (country) {
            case EUROPE:
                factory = new EuropeCarTaxCalculatorAbstractFactory();
                break;
            case UKRAINE:
                factory = new UkraineCarTaxCalculatorAbstractFactory();
                break;
            case USA:
                factory = new UsaCarTaxCalculatorAbstractFactory();
                break;
            default:
                throw new IllegalArgumentException();
        }
        return factory;
    }
}
