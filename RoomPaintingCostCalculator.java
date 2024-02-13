import java.util.Scanner;

public class RoomPaintingCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input room dimensions
        System.out.print("Enter the length of the room (in meters): ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the room (in meters): ");
        double width = scanner.nextDouble();

        // Input cost of paint per square meter
        System.out.print("Enter the cost of paint per square meter (in dollars): ");
        double costPerSquareMeter = scanner.nextDouble();

        // Calculate total area
        double area = length * width;

        // Calculate total cost
        double totalCost = area * costPerSquareMeter;

        // Display the result
        System.out.println("The total cost of painting the room is: $" + totalCost);

        // Close the scanner
        scanner.close();
    }
}