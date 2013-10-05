package patterns.creational.builder;

import patterns.creational.builder.model.Car;

/**
 * Implementation, as used on SMB EE project.
 */
public class CarBuilder {

    private Car prototype;

    private CarBuilder() {
        prototype = new Car();
    }

    public static CarBuilder instance() {
        return new CarBuilder();
    }

    public CarBuilder withBrand(String brand) {
        prototype.setBrand(brand);
        return this;
    }

    public CarBuilder withEngine(int engine) {
        prototype.setEngine(engine);
        return this;
    }

    public CarBuilder withModel(String model) {
        prototype.setModel(model);
        return this;
    }

    public CarBuilder withPower(int power) {
        prototype.setPower(power);
        return this;
    }

    public CarBuilder withPrice(int price) {
        prototype.setPrice(price);
        return this;
    }

    public CarBuilder withTankCapacity(int tankCapacity) {
        prototype.setTankCapacity(tankCapacity);
        return this;
    }

    public Car build() {
        Car car = new Car();

        car.setBrand(prototype.getBrand());
        car.setEngine(prototype.getEngine());
        car.setModel(prototype.getModel());
        car.setPower(prototype.getPower());
        car.setPrice(prototype.getPrice());
        car.setTankCapacity(prototype.getTankCapacity());

        return car;
    }
}
