package patterns.creational.factorymethod;

import patterns.creational.abstractfactory.Country;
import patterns.creational.abstractfactory.EngineTaxCalculator;
import patterns.creational.abstractfactory.impl.eu.EuropeEngineTaxCalculator;
import patterns.creational.abstractfactory.impl.uk.UkraineEngineTaxCalculator;
import patterns.creational.abstractfactory.impl.us.UsaEngineTaxCalculator;

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
