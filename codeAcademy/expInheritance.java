package codeAcademy;

// This is an example of Inheritance
public class expInheritance {
    public static void main(String[] args) {
        // Creating an instance of the codeAcademy.Car class
        Car car = new Car();

        // Creating an instance of the codeAcademy.Bicycle class
        Bicycle bike = new Bicycle();

        // Calling the 'go' method of the codeAcademy.Car class
        car.go("codeAcademy.Car");

        // Calling the 'go' method of the codeAcademy.Bicycle class
        bike.go("Bike");

        // Accessing the 'wheels' variable of the codeAcademy.Car class and printing its value
        System.out.println(car.wheels);

        // Accessing the 'pedals' variable of the codeAcademy.Bicycle class and printing its value
        System.out.println(bike.pedals);
    }
}

// This is the parent class 'codeAcademy.Vehicle'
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

// This is the child class 'codeAcademy.Car' which inherits from 'codeAcademy.Vehicle'
class Car extends Vehicle {
    // Declaring 'wheels' and 'doors' variables specific to codeAcademy.Car
    int wheels = 4;
    int doors = 4;
}

// This is the child class 'codeAcademy.Bicycle' which inherits from 'codeAcademy.Vehicle'
class Bicycle extends Vehicle {
    // Declaring 'wheels' and 'pedals' variables specific to codeAcademy.Bicycle
    int wheels = 2;
    int pedals = 2;
}
