package patterns.structural.bridge;

import patterns.structural.bridge.model.Car;

/**
 * Date: 10/12/13
 * Time: 6:11 PM
 */
public abstract class PersistenceService {

    EntityRepository<Car> entityRepository;

    protected PersistenceService(EntityRepository<Car> entityRepository) {
        this.entityRepository = entityRepository;
    }

    public Car store(Car car){
        return entityRepository.store(car);
    }

    public void delete(Car car){
        entityRepository.delete(car);
    }

}
