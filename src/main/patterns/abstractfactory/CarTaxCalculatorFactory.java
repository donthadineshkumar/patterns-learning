package patterns.abstractfactory;

import patterns.abstractfactory.impl.eu.EuropeCarTaxCalculatorAbstractFactory;
import patterns.abstractfactory.impl.uk.UkraineCarTaxCalculatorAbstractFactory;
import patterns.abstractfactory.impl.us.UsaCarTaxCalculatorAbstractFactory;

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
