package patterns.creational.prototype;

import patterns.creational.prototype.model.Car;
import patterns.creational.prototype.model.CarBrand;

/**
 * Date: 10/5/13
 * Time: 11:37 AM
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CarConstructorFactory.constructCar(CarBrand.AUDI);
        CarConstructorFactory.constructCar(CarBrand.AUDI);
        CarConstructorFactory.constructCar(CarBrand.AUDI);
        CarConstructorFactory.constructCar(CarBrand.VW);
        CarConstructorFactory.constructCar(CarBrand.AUDI);
        CarConstructorFactory.constructCar(CarBrand.AUDI);
    }
}
