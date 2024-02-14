import java.util.Scanner;

public class ExamAverageCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);   // Create a scanner to take input from the user 

        System.out.print("Enter the first exam score: ");
        int score1 = scanner.nextInt();

        System.out.print("Enter the second exam score: ");
        int score2 = scanner.nextInt();

        System.out.print("Enter the third exam score: ");
        int score3 = scanner.nextInt(); // ask user to enter three exam scores to get the average

        scanner.close();

       
        double average = (score1 + score2 + score3) / 3; // funcation to get the average

        
        System.out.printf("The average exam score is: %.2f%n", average); //print the resualt
    }
}