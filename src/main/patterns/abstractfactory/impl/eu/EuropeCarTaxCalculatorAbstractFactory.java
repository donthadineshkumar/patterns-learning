package patterns.abstractfactory.impl.eu;

import patterns.abstractfactory.BodyTaxCalculator;
import patterns.abstractfactory.CarTaxCalculatorAbstractFactory;
import patterns.abstractfactory.EngineTaxCalculator;

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
