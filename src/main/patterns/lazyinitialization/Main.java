package patterns.lazyinitialization;

import patterns.lazyinitialization.model.Car;
import patterns.lazyinitialization.model.CarBrand;

/**
 * Date: 10/5/13
 * Time: 11:19 AM
 */
public class Main {
    public static void main(String[] args) {
        Car car = LazyInitCarFactory.getCar(CarBrand.AUDI);
        car = LazyInitCarFactory.getCar(CarBrand.HONDA);
        car = LazyInitCarFactory.getCar(CarBrand.VOLVO);
        car = LazyInitCarFactory.getCar(CarBrand.AUDI);
    }
}
