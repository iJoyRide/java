// Example of inheritance in java
public class expVehicle {
    public static void main(String[] args) {
        Car car = new Car();

        Bicycle bike = new Bicycle();

        System.out.println(car.wheels);
        System.out.println(bike.pedals);
        
    }
}

class Vehicle {

    double speed;

    void go() {
        System.out.println("This vehicle is moving!");
    }

    void stop() {
        System.out.println("This vehicle has stopped!");
    }
}

class Car extends Vehicle {
    int wheels = 4;
    int doors = 4;
    
}

class Bicycle extends Vehicle {
    int wheels = 2;
    int pedals = 2;
}