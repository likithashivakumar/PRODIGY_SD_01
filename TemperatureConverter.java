import java.util.Scanner;

public class TemperatureConverter {
    
    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    
    // Method to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }
    
    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    
    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for temperature value
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();
        
        // Prompt user for original unit of measurement
        System.out.print("Enter original unit of measurement (C/F/K): ");
        char unit = scanner.next().charAt(0);
        
        switch (unit) {
            case 'C':
            case 'c':
                // Convert from Celsius to Fahrenheit and Kelvin
                double fahrenheitFromCelsius = celsiusToFahrenheit(temperature);
                double kelvinFromCelsius = celsiusToKelvin(temperature);
                System.out.println("Temperature in Fahrenheit: " + fahrenheitFromCelsius);
                System.out.println("Temperature in Kelvin: " + kelvinFromCelsius);
                break;
                
            case 'F':
            case 'f':
                // Convert from Fahrenheit to Celsius and Kelvin
                double celsiusFromFahrenheit = fahrenheitToCelsius(temperature);
                double kelvinFromFahrenheit = fahrenheitToKelvin(temperature);
                System.out.println("Temperature in Celsius: " + celsiusFromFahrenheit);
                System.out.println("Temperature in Kelvin: " + kelvinFromFahrenheit);
                break;
                
            case 'K':
            case 'k':
                // Convert from Kelvin to Celsius and Fahrenheit
                double celsiusFromKelvin = kelvinToCelsius(temperature);
                double fahrenheitFromKelvin = kelvinToFahrenheit(temperature);
                System.out.println("Temperature in Celsius: " + celsiusFromKelvin);
                System.out.println("Temperature in Fahrenheit: " + fahrenheitFromKelvin);
                break;
                
            default:
                System.out.println("Invalid unit of measurement. Please enter C, F, or K.");
        }
        
        scanner.close();
    }
}
