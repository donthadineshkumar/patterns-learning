package patterns.creational.abstractfactory.impl.eu;

import patterns.creational.abstractfactory.BodyTaxCalculator;
import patterns.creational.abstractfactory.CarTaxCalculatorAbstractFactory;
import patterns.creational.abstractfactory.EngineTaxCalculator;

/**
 * Date: 9/28/13
 * Time: 12:34 PM
 */
public class EuropeCarTaxCalculatorAbstractFactory implements CarTaxCalculatorAbstractFactory {
    @Override
    public EngineTaxCalculator getEngineTaxCalculator() {
        return new EuropeEngineTaxCalculator();
    }

    @Override
    public BodyTaxCalculator getBodyTaxCalculator() {
        return new EuropeBodyTaxCalculator();
    }

}
