// This is the main class where the program starts
public class expVehicle {
    public static void main(String[] args) {
        // Creating an instance of the Car class
        Car car = new Car();

        // Creating an instance of the Bicycle class
        Bicycle bike = new Bicycle();

        // Calling the 'go' method of the Car class
        car.go("Car");

        // Calling the 'go' method of the Bicycle class
        bike.go("Bike");

        // Accessing the 'wheels' variable of the Car class and printing its value
        System.out.println(car.wheels);

        // Accessing the 'pedals' variable of the Bicycle class and printing its value
        System.out.println(bike.pedals);
    }
}

// This is the parent class 'Vehicle'
class Vehicle {
    // Declaring a 'speed' variable
    double speed;

    // Method to make the vehicle go
    void go(String vehicleType) {
        System.out.println("This " + vehicleType + " is moving!");
    }

    // Method to stop the vehicle
    void stop() {
        System.out.println("This vehicle has stopped!");
    }
}

// This is the child class 'Car' which inherits from 'Vehicle'
class Car extends Vehicle {
    // Declaring 'wheels' and 'doors' variables specific to Car
    int wheels = 4;
    int doors = 4;
}

// This is the child class 'Bicycle' which inherits from 'Vehicle'
class Bicycle extends Vehicle {
    // Declaring 'wheels' and 'pedals' variables specific to Bicycle
    int wheels = 2;
    int pedals = 2;
}
