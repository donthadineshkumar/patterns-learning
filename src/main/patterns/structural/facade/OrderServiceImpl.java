package patterns.structural.facade;

import patterns.structural.facade.model.Order;
import patterns.structural.facade.model.User;

/**
 * Date: 10/26/13
 * Time: 11:35 AM
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public boolean putOrder(User user, Order order) {
        System.out.println(String.format("Order %s is succesfully processed!", order.getName() ));
        return true;
    }

    @Override
    public int getUserId(int orderId) {
        return Math.abs(orderId * 2 - 5);
    }
}
