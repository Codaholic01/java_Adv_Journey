package OOPS.Abstraction;

// Abstract class
abstract class Vehicle {
    abstract void start();  // abstract method (no body)

    void stop() {           // regular method
        System.out.println("Vehicle stopped");
    }
}

// Child class
class Car extends Vehicle {
    void start() {          // must implement abstract method
        System.out.println("Car started");
    }
}

