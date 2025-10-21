package OOPS.Abstraction;

public class AbsTest {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.start();  // calls implemented method
        myCar.stop();   // calls regular method from abstract class
    }
}
