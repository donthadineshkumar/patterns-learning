package patterns.creational.builder;

import patterns.creational.builder.model.Car;
import patterns.creational.builder.model.Customer;

public class Main {

    public static void main(String[] args) {
        Car car = CarBuilder.instance().withBrand("AUDI").withModel("A6").build();

        Customer customer = new Customer.CustomerBuilder("Bob").lastName("Stadnyk").age(28).build();

        int x = 10;
    }
}
