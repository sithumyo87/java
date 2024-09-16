package Assigment2;

import java.util.Scanner;

public class No8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            // Prompt the user to enter a positive integer
            System.out.print("Enter a positive integer (1-100) or 9999 to quit: ");
            int number = scanner.nextInt();

            // Check if the user entered 9999 to terminate the program
            if (number == 9999) {
                break;
            }

            // Validate the input is within the range of 1 to 100
            if (number >= 1 && number <= 100) {
                sum += number;
                count++;
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
            }
        }

        // Calculate and display the average if any valid numbers were entered
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of the entered numbers: " + average);
        } else {
            System.out.println("No valid numbers were entered.");
        }
    }
}
