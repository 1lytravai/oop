import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit);
        System.out.println("Temperature in Celsius: " + celsius);

        System.out.print("Enter temperature in Celsius: ");
        double celsiusInput = scanner.nextDouble();

        double fahrenheitOutput = TemperatureConverter.celsiusToFahrenheit(celsiusInput);
        System.out.println("Temperature in Fahrenheit: " + fahrenheitOutput);

        scanner.close();
    }
}

class TemperatureConverter {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
