package patterns.structural.bridge;

import patterns.structural.bridge.impl.EntityRepositoryJdbcImpl;
import patterns.structural.bridge.model.Car;

/**
 * Date: 10/12/13
 * Time: 6:16 PM
 */
public class JdbcPersistenceService extends PersistenceService {

    public JdbcPersistenceService() {
        super(new EntityRepositoryJdbcImpl());
    }
}
