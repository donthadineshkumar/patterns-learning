package patterns.builder;

import patterns.builder.model.Car;

public class Main {

    public static void main(String[] args) {
        Car car = CarBuilder.instance().withBrand("AUDI").withModel("A6").build();
        int x = 10;
    }
}
