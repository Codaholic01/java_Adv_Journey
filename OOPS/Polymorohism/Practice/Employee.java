package OOPS.Polymorohism.Practice;

    // Parent class
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " is working in the company.");
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

// Child class 1
  class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void work() {   // Overridden method
        System.out.println(name + " is developing software using " + programmingLanguage + ".");
    }
}

// Child class 2
class Tester extends Employee {
    String testingTool;

    Tester(String name, double salary, String testingTool) {
        super(name, salary);
        this.testingTool = testingTool;
    }

    void work() {   // Overridden method
        System.out.println(name + " is testing applications using " + testingTool + ".");
    }
}

// Child class 3
class Manager extends Employee {
    int teamSize;

    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    void work() {   // Overridden method
        System.out.println(name + " is managing a team of " + teamSize + " people.");
    }
}



    

