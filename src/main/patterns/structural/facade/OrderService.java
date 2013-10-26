package patterns.structural.facade;

import patterns.structural.facade.model.Order;
import patterns.structural.facade.model.User;

/**
 * Date: 10/26/13
 * Time: 11:35 AM
 */
public interface OrderService {
    boolean putOrder(User user, Order order);

    int getUserId(int orderId);
}
