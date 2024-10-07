package calculator;

import java.util.Scanner;

public class MainCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n*****Welcome to our Enhanced Console-based calculator*****");
            System.out.println("\n***** Calculator Menu *****");
            System.out.println("1. Basic Calculations");
            System.out.println("2. Scientific Calculations");
            System.out.println("3. Unit Conversions");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performBasicCalculations(scanner);
                    break;
                case 2:
                    performScientificCalculations(scanner);
                    break;
                case 3:
                    performUnitConversions(scanner);
                    break;
                case 0:
                    exit = true;
                    System.out.println("Exiting the our Enhanced Console-0based calculator. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    // Perform basic calculations
    public static void performBasicCalculations(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nChoose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.print("Enter choice: ");
        int operation = scanner.nextInt();

        double result = 0;

        switch (operation) {
            case 1:
                result = BasicCalculator.add(num1, num2);
                break;
            case 2:
                result = BasicCalculator.subtract(num1, num2);
                break;
            case 3:
                result = BasicCalculator.multiply(num1, num2);
                break;
            case 4:
                result = BasicCalculator.divide(num1, num2);
                break;
            case 5:
                result = ScientificCalculator.modulus(num1, num2);
                break;
            default:
                System.out.println("Invalid operation.");
        }

        System.out.println("Result: " + result);
    }

    // Perform scientific calculations
    public static void performScientificCalculations(Scanner scanner) {
        System.out.println("\nScientific Operations:");
        System.out.println("1. Sine");
        System.out.println("2. Cosine");
        System.out.println("3. Tangent");
        System.out.println("4. Log (Natural)");
        System.out.println("5. Log10");
        System.out.println("6. Exponent (e^x)");
        System.out.println("7. Factorial");
        System.out.println("8. Permutation");
        System.out.println("9. Combination");
        System.out.println("10. Cube Root");
        System.out.println("11. Power of 10");
        System.out.println("12. Convert Degrees to Radians");
        System.out.println("13. Convert Radians to Degrees");
        System.out.print("Enter your choice: ");
        int operation = scanner.nextInt();

        double result = 0;

        switch (operation) {
            case 1: // Sine
                System.out.print("Enter angle in radians: ");
                result = ScientificCalculator.sin(scanner.nextDouble());
                break;
            case 2: // Cosine
                System.out.print("Enter angle in radians: ");
                result = ScientificCalculator.cos(scanner.nextDouble());
                break;
            case 3: // Tangent
                System.out.print("Enter angle in radians: ");
                result = ScientificCalculator.tan(scanner.nextDouble());
                break;
            case 4: // Log (Natural)
                System.out.print("Enter value: ");
                result = ScientificCalculator.log(scanner.nextDouble());
                break;
            case 5: // Log10
                System.out.print("Enter value: ");
                result = ScientificCalculator.log10(scanner.nextDouble());
                break;
            case 6: // Exponent
                System.out.print("Enter exponent: ");
                result = ScientificCalculator.exp(scanner.nextDouble());
                break;
            case 7: // Factorial
                System.out.print("Enter an integer: ");
                result = ScientificCalculator.factorial(scanner.nextInt());
                break;
            case 8: // Permutation
                System.out.print("Enter n: ");
                int n = scanner.nextInt();
                System.out.print("Enter r: ");
                int r = scanner.nextInt();
                result = ScientificCalculator.permutation(n, r);
                break;
            case 9: // Combination
                System.out.print("Enter n: ");
                n = scanner.nextInt();
                System.out.print("Enter r: ");
                r = scanner.nextInt();
                result = ScientificCalculator.combination(n, r);
                break;
            case 10: // Cube Root
                System.out.print("Enter value: ");
                result = ScientificCalculator.cbrt(scanner.nextDouble());
                break;
            case 11: // Power of 10
                System.out.print("Enter exponent: ");
                result = ScientificCalculator.pow10(scanner.nextDouble());
                break;
            case 12: // Convert Degrees to Radians
                System.out.print("Enter degrees: ");
                result = ScientificCalculator.toRadians(scanner.nextDouble());
                break;
            case 13: // Convert Radians to Degrees
                System.out.print("Enter radians: ");
                result = ScientificCalculator.toDegrees(scanner.nextDouble());
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        System.out.println("Result: " + result);
    }

    // Perform unit conversions
    public static void performUnitConversions(Scanner scanner) {
        System.out.println("\nUnit Conversions:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. USD to INR");
        System.out.println("4. INR to USD");
        System.out.print("Enter your choice: ");
        int conversion = scanner.nextInt();

        double result = 0;

        switch (conversion) {
            case 1: // Celsius to Fahrenheit
                System.out.print("Enter temperature in Celsius: ");
                result = UnitConverter.celsiusToFahrenheit(scanner.nextDouble());
                break;
            case 2: // Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                result = UnitConverter.fahrenheitToCelsius(scanner.nextDouble());
                break;
            case 3: // USD to INR
                System.out.print("Enter amount in USD: ");
                result = UnitConverter.usdToInr(scanner.nextDouble());
                break;
            case 4: // INR to USD
                System.out.print("Enter amount in INR: ");
                result = UnitConverter.inrToUsd(scanner.nextDouble());
                break;
            default:
                System.out.println("Invalid conversion choice.");
                return;
        }

        System.out.println("Converted result: " + result);
    }
}
