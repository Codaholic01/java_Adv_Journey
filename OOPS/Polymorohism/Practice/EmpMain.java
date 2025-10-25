package OOPS.Polymorohism.Practice;

public class EmpMain {
    // Main class

    public static void main(String[] args) {
        // Parent reference pointing to different child objects
        Employee e1 = new Developer("Rohit", 85000, "Java");
        Employee e2 = new Tester("Neha", 70000, "Selenium");
        Employee e3 = new Manager("Amit", 100000, 10);

        // Common method call (shows polymorphism)
        e1.showDetails();
        e1.work();

        System.out.println("------------------");

        e2.showDetails();
        e2.work();

        System.out.println("------------------");

        e3.showDetails();
        e3.work();
    }
}

