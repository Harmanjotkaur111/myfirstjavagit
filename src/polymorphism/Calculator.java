package polymorphism;

public class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers having same method name same class, different parameters, type of parameters and order of parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calls the method with two int parameters
        System.out.println("Sum of 5 and 10: " + calc.add(5, 10));

        // Calls the method with three int parameters
        System.out.println("Sum of 5, 10, and 15: " + calc.add(5, 10, 15));

        // Calls the method with two double parameters
        System.out.println("Sum of 5.5 and 10.5: " + calc.add(5.5, 10.5));
    }
}
