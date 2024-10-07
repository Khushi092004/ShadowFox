package calculator;

public class BasicCalculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division, including error handling for division by zero
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is undefined.");
            return 0; // Returning 0 to indicate an error
        }
        return a / b;
    }
}
