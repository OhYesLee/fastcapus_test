package chapter02.ch02.ch01.chapter02.ch19_re;

public class CarFactory {
    private static CarFactory instance = new CarFactory();

    private CarFactory() {
    }

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar() {

        Car car = new Car();
        return car;
    }
}
