package patterns.creational.abstractfactory;

/**
 * Date: 9/28/13
 * Time: 12:17 PM
 */
public interface CarTaxCalculatorAbstractFactory {
    EngineTaxCalculator getEngineTaxCalculator();

    BodyTaxCalculator getBodyTaxCalculator();
}
