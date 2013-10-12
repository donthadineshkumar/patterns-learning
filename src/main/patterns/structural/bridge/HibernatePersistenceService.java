package patterns.structural.bridge;

import patterns.structural.bridge.impl.EntityRepositoryHibernateImpl;
import patterns.structural.bridge.model.Car;

/**
 * Date: 10/12/13
 * Time: 6:18 PM
 */
public class HibernatePersistenceService extends PersistenceService{

    protected HibernatePersistenceService() {
        super(new EntityRepositoryHibernateImpl());
    }
}
