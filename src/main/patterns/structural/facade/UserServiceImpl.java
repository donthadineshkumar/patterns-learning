package patterns.structural.facade;

import patterns.structural.facade.model.User;

import java.util.Random;

/**
 * Date: 10/26/13
 * Time: 11:35 AM
 */
public class UserServiceImpl implements UserService {
    private static final Random RANDOM = new Random();

    @Override
    public User createUser(User user) {
        System.out.println(String.format("User %s, %s created successfully!", user.getFirstName(), user.getSurname()));
        return user;
    }

    @Override
    public User getById(int id) {
        System.out.println(String.format("User get from database by id %s", id));
        int age = RANDOM.nextInt(55) + 18;
        return new User(age, generateRandomString(), generateRandomString());
    }

    private String generateRandomString() {
        int length = RANDOM.nextInt(25) + 5;
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int el = RANDOM.nextInt();
            stringBuilder.append((char) el);
        }
        return stringBuilder.toString();
    }
}
