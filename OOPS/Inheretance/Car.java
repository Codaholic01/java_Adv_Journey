package OOPS.Inheretance;

// Parent class (base class)
class Car {
    String color = "White";

    void display() {
        System.out.println("Car color: " + color);
    }
}

// Child class (derived class)
class SportsCar extends Car {
    int maxSpeed = 200;

    void displaySpeed() {
        System.out.println("Max speed: " + maxSpeed + " km/h");
    }
}

