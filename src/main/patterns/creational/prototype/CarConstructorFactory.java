package patterns.creational.prototype;

import patterns.creational.prototype.model.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Date: 10/5/13
 * Time: 12:22 PM
 */
public class CarConstructorFactory {

    /**
     * Factory class. No constructor call is allowed.
     */
    private CarConstructorFactory(){
        throw new IllegalStateException();
    }

    public static Car constructCar(CarBrand carBrand) throws CloneNotSupportedException {
        System.out.println(String.format("constructing car %s", carBrand));
        Car car;
        Engine engine = EnginePrototypeFactory.getEngine(carBrand);
        switch (carBrand){
            case AUDI:
                car = new Audi(engine);
                break;
            case VW:
                car = new VW(engine);
                break;
            default:throw new IllegalArgumentException();
        }
        return car;
    }
}
