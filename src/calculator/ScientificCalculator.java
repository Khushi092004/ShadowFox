package calculator;

public class ScientificCalculator extends BasicCalculator {
	
	// Method to calculate square root
    public static double sqrt(double a) {
        if (a < 0) {
            System.out.println("Error: Cannot calculate the square root of a negative number.");
            return 0; // Return 0 to indicate an error
        }
        return Math.sqrt(a);
    }

    // Method to calculate power (a^b)
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Trigonometric functions
    public static double sin(double radians) {
        return Math.sin(radians);
    }

    public static double cos(double radians) {
        return Math.cos(radians);
    }

    public static double tan(double radians) {
        return Math.tan(radians);
    }

    // Logarithmic functions
    public static double log(double value) {
        return Math.log(value); // Natural log (ln)
    }

    public static double log10(double value) {
        return Math.log10(value); // Logarithm base 10
    }

    // Exponential function
    public static double exp(double exponent) {
        return Math.exp(exponent); // e^x
    }

    // Factorial function
    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    // Permutation and Combination
    public static long permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static long combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // Hyperbolic functions
    public static double sinh(double value) {
        return Math.sinh(value);
    }

    public static double cosh(double value) {
        return Math.cosh(value);
    }

    public static double tanh(double value) {
        return Math.tanh(value);
    }

    // Modulus operation
    public static double modulus(double a, double b) {
        return a % b;
    }

    // Cube root
    public static double cbrt(double value) {
        return Math.cbrt(value);
    }

    // Power of 10
    public static double pow10(double exponent) {
        return Math.pow(10, exponent); // 10^x
    }

    // Degrees and Radians conversion
    public static double toRadians(double degrees) {
        return Math.toRadians(degrees);
    }

    public static double toDegrees(double radians) {
        return Math.toDegrees(radians);
    }
}
