package patterns.structural.facade;

import patterns.structural.facade.model.User;

/**
 * Date: 10/26/13
 * Time: 11:34 AM
 */
public interface UserService {
    User createUser(User user);

    User getById(int id);
}
