package Assigment2;

import java.util.Scanner;
import java.util.Random;

public class No10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        int guess = 0;
        int numberOfGuesses = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        // Loop until the user guesses the correct number
        while (guess != randomNumber) {
            // Prompt the user to enter a guess
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfGuesses++;

            // Check if the guess is too high, too low, or correct
            if (guess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("It took you " + numberOfGuesses + " guesses.");
            }
        }
    }
}

