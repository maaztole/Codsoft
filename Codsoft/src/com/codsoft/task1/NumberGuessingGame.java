package com.codsoft.task1;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        boolean playAgain = true;
        int totalScore = 0;
        int round = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
        	// Generate a number between 1 and 100
            int numberToGuess = random.nextInt(100) + 1; 
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;
            round++;
            
            System.out.println("\nRound " + round);
            System.out.println("I have picked a number between 1 and 100. Can you guess it?");
            System.out.println("You have " + maxAttempts + " attempts. Good luck!");
            
            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    totalScore += maxAttempts - attempts + 1; // Score based on remaining attempts
                } else if (userGuess < numberToGuess) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }
                
                if (!guessedCorrectly && attempts == maxAttempts) {
                    System.out.println("You've used all your attempts. The correct number was: " + numberToGuess);
                }
            }

            System.out.println("Your total score after round " + round + " is: " + totalScore);
            
            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("\nGame over! Your final score is: " + totalScore);
        scanner.close();
    }
}
