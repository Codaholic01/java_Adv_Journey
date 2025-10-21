package OOPS.Encapulation;

// Encapsulated class
class Student {
    // Private variables (cannot be accessed directly from outside)
    private String name;
    private int age;

    // Setter methods (to set values)
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        if(a > 0) {  // simple validation
            age = a;
        } else {
            System.out.println("Age must be positive");
        }
    }

    // Getter methods (to get values)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

