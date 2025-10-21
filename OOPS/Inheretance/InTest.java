package OOPS.Inheretance;

public class InTest {
    public static void main(String[] args) {
        // Create object of child class
        SportsCar myCar = new SportsCar();

        // Access parent class method and variable
        myCar.display();  // from Car class

        // Access child class method and variable
        myCar.displaySpeed();  // from SportsCar class
    }
}
