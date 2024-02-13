import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input average speed
        System.out.print("Enter the average speed of the car (in miles per hour): ");
        double speed = scanner.nextDouble();

        // Input time traveled
        System.out.print("Enter the time traveled (in hours): ");
        double time = scanner.nextDouble();

        // Calculate total distance
        double distance = speed * time;

        // Display the result
        System.out.println("The total distance covered by the car is: " + distance + " miles");

        // Close the scanner
        scanner.close();
    }
}