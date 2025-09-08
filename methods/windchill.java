import java.util.Scanner;

public class windchill {

    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature + 
                           (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature and wind speed
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed in mph: ");
        double windSpeed = scanner.nextDouble();

        if (windSpeed < 0) {
            System.out.println("Wind speed cannot be negative.");
        } else {
            // Calculate wind chill
            double windChill = calculateWindChill(temperature, windSpeed);

            // Display the result
            System.out.printf("The wind chill temperature is %.2f°F%n", windChill);
        }

        scanner.close();
    }
}
