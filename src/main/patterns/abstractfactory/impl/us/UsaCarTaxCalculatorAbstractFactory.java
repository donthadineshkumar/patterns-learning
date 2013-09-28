package patterns.abstractfactory.impl.us;

import patterns.abstractfactory.BodyTaxCalculator;
import patterns.abstractfactory.CarTaxCalculatorAbstractFactory;
import patterns.abstractfactory.EngineTaxCalculator;

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
