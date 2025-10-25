 package OOPS.Inheretance.Practice;

// Base class

class Employee {
    String name;
    int id;
    double salary;

    void setDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

// Derived class
class Manager extends Employee {
    String department;

    void setDepartment(String dept) {
        this.department = dept;
    }

    void displayManagerInfo() {
        System.out.println("Department: " + department);
    }
}

// Another derived class
class Developer extends Employee {
    String programmingLanguage;

    void setLanguage(String lang) {
        this.programmingLanguage = lang;
    }

    void displayDeveloperInfo() {
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

