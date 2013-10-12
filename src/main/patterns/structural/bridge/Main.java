package patterns.structural.bridge;

import patterns.structural.bridge.impl.EntityRepositoryHibernateImpl;
import patterns.structural.bridge.impl.EntityRepositoryJdbcImpl;
import patterns.structural.bridge.model.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 10/12/13
 * Time: 4:42 PM
 */
public class Main {
    public static void main(String[] args) {
        List<PersistenceService> services = new ArrayList<PersistenceService>();
        services.add(new HibernatePersistenceService());
        services.add(new JdbcPersistenceService());

        Car car = new Car("Honda", "Accord");
        for(PersistenceService service : services){
            car = service.store(car);
            service.delete(car);
        }
    }
}
