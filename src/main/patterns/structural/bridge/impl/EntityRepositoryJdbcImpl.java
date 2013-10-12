package patterns.structural.bridge.impl;

import patterns.structural.bridge.EntityRepository;
import patterns.structural.bridge.model.Car;

/**
 * Date: 10/12/13
 * Time: 6:03 PM
 */
public class EntityRepositoryJdbcImpl implements EntityRepository<Car> {
    @Override
    public Car store(Car entity) {
        info("store", entity);
        return entity;
    }

    @Override
    public Car update(Car entity) {
        info("update", entity);
        return entity;
    }

    @Override
    public void delete(Car entity) {
        info("delete", entity);
    }

    @Override
    public Car setActive(Car entity) {
        info("setActive", entity);
        return entity;
    }

    private void info(String method, Car entity){
        System.out.println("Jdbc impl : " + method + " Target is : " + entity.getBrand() + " ::: " + entity.getModel());
    }
}
