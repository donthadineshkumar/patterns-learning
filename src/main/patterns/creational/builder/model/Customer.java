package patterns.creational.builder.model;

public class Customer {

    private final String firstName;

    private final String lastName;

    private final String middleName;

    private final int age;

    private Customer(CustomerBuilder customerBuilder) {
        firstName = customerBuilder.firstName;
        lastName = customerBuilder.lastName;
        middleName = customerBuilder.middleName;
        age = customerBuilder.age;
    }

    /**
     * Implementation, as described in most resources.
     */
    public static class CustomerBuilder {

        private final String firstName;

        private String lastName;

        private String middleName;

        private int age;

        public CustomerBuilder(String firstName) {
            this.firstName = firstName;
        }

        public CustomerBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public CustomerBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public CustomerBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Customer build() {
            Customer customer = new Customer(this);
            return customer;
        }
    }
}
