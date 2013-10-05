package patterns.creational.prototype;

import patterns.creational.prototype.model.CarBrand;
import patterns.creational.prototype.model.Engine;

import java.util.HashMap;
import java.util.Map;

/**
 * Date: 10/5/13
 * Time: 12:34 PM
 */
public class EnginePrototypeFactory {
    private static final Map<CarBrand, Engine> engines = new HashMap<CarBrand, Engine>();

    /**
     * Factory class. No constructor call is allowed.
     */
    private EnginePrototypeFactory() {
        throw new IllegalStateException();
    }

    /**
     * Lazy load engine factory method with prototyping.
     * @param carBrand
     * @return
     * @throws CloneNotSupportedException
     */
    public static Engine getEngine(CarBrand carBrand) throws CloneNotSupportedException {
        Engine prototype = engines.get(carBrand);
        if (prototype == null) {
            switch (carBrand) {
                case VW:
                    prototype = new Engine(167);
                    break;
                case AUDI:
                    prototype = new Engine(212);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            engines.put(carBrand, prototype);
        }

        return (Engine) prototype.clone();
    }

}
