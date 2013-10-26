package patterns.structural.facade.model;

/**
 * Date: 10/26/13
 * Time: 11:36 AM
 */
public class User {
    private final String firstName;
    private final String surname;
    private final int age;

    public User(int age, String surname, String firstName) {
        this.age = age;
        this.surname = surname;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
