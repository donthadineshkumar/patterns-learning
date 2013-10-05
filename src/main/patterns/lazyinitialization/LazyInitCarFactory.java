package patterns.lazyinitialization;

import patterns.lazyinitialization.model.*;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Date: 10/5/13
 * Time: 11:10 AM
 */
public class LazyInitCarFactory {
    private static final Logger LOGGER = Logger.getLogger(LazyInitCarFactory.class.toString());

    private static final Map<CarBrand, Car> cars = new HashMap<CarBrand, Car>();

    private LazyInitCarFactory() {
        throw new IllegalStateException("Init of factory is prohibited!");
    }

    public static Car getCar(CarBrand carBrand) {
        Car car = cars.get(carBrand);
        if (car == null) {
            switch (carBrand) {
                case AUDI:
                    LOGGER.info("Constructing of new Audi");
                    car = new Audi();
                    break;
                case HONDA:
                    LOGGER.info("Constructing of new Honda");
                    car = new Honda();
                    break;
                case VOLVO:
                    LOGGER.info("Constructing of new Volvo");
                    car = new Volvo();
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            cars.put(carBrand, car);
        }
        return car;
    }
}
