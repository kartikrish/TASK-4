/**
   Modular Calculator
 * Demonstrates basic methods, overloading, and exception handling
 */
public class Main {

    // Addition method
    static int add(int a, int b) {
        return a + b;
    }

    // Method overloading (double type)
    static double add(double a, double b) {
        return a + b;
    }

    // Subtraction method
    static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication method
    static int multiply(int a, int b) {
        return a * b;
    }

    // Division method with exception handling
    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Utility method to show result
    static void showResult(String name, int result) {
        System.out.println(name + ": " + result);
    }

    // Pass-by-value example
    static void changeNumber(int num) {
        num = num + 5;
        System.out.println("Inside method value: " + num);
    }

    // Main method (testing all methods)
    public static void main(String[] args) {

        showResult("Addition", add(10, 5));
        showResult("Subtraction", subtract(10, 5));
        showResult("Multiplication", multiply(10, 5));

        System.out.println("Double Addition: " + add(2.5, 3.5));

        try {
            showResult("Division", divide(10, 2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int number = 10;
        System.out.println("Before method call: " + number);
        changeNumber(number);
        System.out.println("After method call: " + number);
    }
}
