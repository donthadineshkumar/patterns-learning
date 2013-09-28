package patterns.abstractfactory.impl.uk;

import patterns.abstractfactory.BodyTaxCalculator;
import patterns.abstractfactory.CarTaxCalculatorAbstractFactory;
import patterns.abstractfactory.EngineTaxCalculator;

/**
 * Date: 9/28/13
 * Time: 12:34 PM
 */
public class UkraineCarTaxCalculatorAbstractFactory implements CarTaxCalculatorAbstractFactory {
    @Override
    public EngineTaxCalculator getEngineTaxCalculator() {
        return new UkraineEngineTaxCalculator();
    }

    @Override
    public BodyTaxCalculator getBodyTaxCalculator() {
        return new UkraineBodyTaxCalculator();
    }
}
