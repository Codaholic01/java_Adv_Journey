package OOPS.Polymorohism;

public class MoTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));       // calls 2-parameter method
        System.out.println(calc.add(2, 4, 6));     // calls 3-parameter method
    }
}
