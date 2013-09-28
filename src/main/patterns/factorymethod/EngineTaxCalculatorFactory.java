package patterns.factorymethod;

import patterns.abstractfactory.Country;
import patterns.abstractfactory.EngineTaxCalculator;
import patterns.abstractfactory.impl.eu.EuropeEngineTaxCalculator;
import patterns.abstractfactory.impl.uk.UkraineEngineTaxCalculator;
import patterns.abstractfactory.impl.us.UsaEngineTaxCalculator;

/**
 * Date: 9/28/13
 * Time: 2:10 PM
 */
public class EngineTaxCalculatorFactory {
    public static EngineTaxCalculator getEngineTaxCalculator(Country country){
        EngineTaxCalculator engineTaxCalculator;
        switch (country){
            case USA:
                engineTaxCalculator = new UsaEngineTaxCalculator();
                break;
            case UKRAINE:
                engineTaxCalculator = new UkraineEngineTaxCalculator();
                break;
            case EUROPE:
                engineTaxCalculator = new EuropeEngineTaxCalculator();
                break;
            default:throw new IllegalArgumentException();
        }
        return engineTaxCalculator;
    }
}
