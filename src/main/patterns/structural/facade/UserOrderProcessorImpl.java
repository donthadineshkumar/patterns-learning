package patterns.structural.facade;

import patterns.structural.facade.model.Order;
import patterns.structural.facade.model.User;

/**
 * Date: 10/26/13
 * Time: 11:47 AM
 */

/**
 * Facade class.
 */
public class UserOrderProcessorImpl implements UserOrderProcessor {
    private UserService userService;
    private OrderService orderService;

    public UserOrderProcessorImpl(UserService userService, OrderService orderService) {
        this.userService = userService;
        this.orderService = orderService;
    }

    @Override
    public void registerUserAndPutFirstOrder(User user, Order order) {
        User newUser = userService.createUser(user);
        orderService.putOrder(newUser, order);
    }

    @Override
    public User getUserByOrder(Order order) {
        int userId = orderService.getUserId(order.getId());
        return userService.getById(userId);
    }
}
