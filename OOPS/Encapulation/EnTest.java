package OOPS.Encapulation;

public class EnTest {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Set values using setters
        s1.setName("Shreekant");
        s1.setAge(22);

        // Get values using getters
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
