package patterns.abstractfactory.impl;

import patterns.abstractfactory.CarTaxCalculatorAbstractFactory;

/**
 * Date: 9/28/13
 * Time: 12:52 PM
 */
public class TaxProcessor {
    private CarTaxCalculatorAbstractFactory carTaxCalculatorAbstractFactory;

    public TaxProcessor(CarTaxCalculatorAbstractFactory carTaxCalculatorAbstractFactory) {
        this.carTaxCalculatorAbstractFactory = carTaxCalculatorAbstractFactory;
    }

    public void processTaxes(Car car){
        double engineTax = carTaxCalculatorAbstractFactory.getEngineTaxCalculator().calculate(car);

        double bodyTax = carTaxCalculatorAbstractFactory.getBodyTaxCalculator().calculate(car);

        System.out.println(String.format("Tax Processor Factory is %s", carTaxCalculatorAbstractFactory.getClass()));
        System.out.println(String.format("Body tax = %s", bodyTax));
        System.out.println(String.format("Engine tax = %s", engineTax));
    }
}
