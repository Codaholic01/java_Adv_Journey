package OOPS.Polymorohism;

class Calculator {
    // Add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // Add three numbers (same method name, different parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }
}


