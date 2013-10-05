package patterns.creational.abstractfactory.impl.uk;

import patterns.creational.abstractfactory.BodyTaxCalculator;
import patterns.creational.abstractfactory.CarTaxCalculatorAbstractFactory;
import patterns.creational.abstractfactory.EngineTaxCalculator;

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
