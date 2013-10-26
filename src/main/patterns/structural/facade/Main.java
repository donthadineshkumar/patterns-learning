package patterns.structural.facade;

import patterns.structural.facade.model.Order;
import patterns.structural.facade.model.User;

/**
 * Date: 10/26/13
 * Time: 11:49 AM
 */
public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        OrderService orderService = new OrderServiceImpl();
        UserOrderProcessor processor = new UserOrderProcessorImpl(userService, orderService);

        User user = new User(22, "Vasya", "Pupkin");
        Order order = new Order();
        order.setId(34);
        order.setName("Nexus 7 gen 2");

        processor.registerUserAndPutFirstOrder(user, order);

        User userByOrder = processor.getUserByOrder(order);
        System.out.println(String.format("User : %s, %s", userByOrder.getFirstName(), userByOrder.getSurname()));
    }
}
