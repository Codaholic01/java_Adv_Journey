package OOPS.Constructor;

class Car {
    String color;
    int speed;

    // Constructor
    Car() {
        color = "White";
        speed = 100;
    }

    void displayInfo() {
        System.out.println("Car color: " + color);
        System.out.println("Car speed: " + speed);
    }
}

