package patterns.creational.abstractfactory.impl.us;

import patterns.creational.abstractfactory.BodyTaxCalculator;
import patterns.creational.abstractfactory.CarTaxCalculatorAbstractFactory;
import patterns.creational.abstractfactory.EngineTaxCalculator;

/**
 * Date: 9/28/13
 * Time: 12:34 PM
 */
public class UsaCarTaxCalculatorAbstractFactory implements CarTaxCalculatorAbstractFactory {
    @Override
    public EngineTaxCalculator getEngineTaxCalculator() {
        return new UsaEngineTaxCalculator();
    }

    @Override
    public BodyTaxCalculator getBodyTaxCalculator() {
        return new UsaBodyTaxCalculator();
    }
}
