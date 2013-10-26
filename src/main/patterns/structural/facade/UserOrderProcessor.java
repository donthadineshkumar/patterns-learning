package patterns.structural.facade;

import patterns.structural.facade.model.Order;
import patterns.structural.facade.model.User;

/**
 * Date: 10/26/13
 * Time: 11:47 AM
 */
public interface UserOrderProcessor {
    void registerUserAndPutFirstOrder(User user, Order order);

    User getUserByOrder(Order order);
}
