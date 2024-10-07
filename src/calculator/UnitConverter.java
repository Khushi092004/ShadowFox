package calculator;

public class UnitConverter {

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert USD to INR
    public static double usdToInr(double usd) {
        return usd * 83; // Assuming 1 USD = 83 INR
    }

    // Convert INR to USD
    public static double inrToUsd(double inr) {
        return inr / 83; // Assuming 1 USD = 83 INR
    }
}
