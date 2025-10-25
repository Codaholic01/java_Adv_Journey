package OOPS.Inheretance.Practice;

public class MainEmployee {
      public static void main(String[] args) {
        Manager m = new Manager();
        m.setDetails("Rohit", 101, 85000);
        m.setDepartment("IT");
        m.displayDetails();
        m.displayManagerInfo();

        System.out.println("-----------------------");

        Developer d = new Developer();
        d.setDetails("Neha", 102, 75000);
        d.setLanguage("Java");
        d.displayDetails();
        d.displayDeveloperInfo();
    }
}

