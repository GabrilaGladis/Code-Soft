package Code_Soft;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int max_Attempts = 5;

        System.out.println("WELCOME TO TASK1 OF CODESOFT-GUESSING THE RANDOM NUMBER");

        boolean second_chance= true;
        while (second_chance) {
            int random_Number = r.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("I've selected a number between 1 and 100. Can you guess what it is?");

            while (attempts < max_Attempts && !guessedCorrectly) {
                System.out.print("Enter your guess (" + (max_Attempts - attempts) + " attempts left): ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == random_Number) {
                    System.out.println("Congratulations! You've guessed the correct number: " + random_Number);
                    guessedCorrectly = true;
                } else if (userGuess < random_Number) {
                    System.out.println("Too low! Try again a higher number.");
                } else {
                    System.out.println("Too high! Try again a lower number.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + random_Number);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            second_chance = playAgainResponse.equals("yes");
        }

        System.out.println("Thank you for playing Guess the Number!");
        scanner.close();
    }
}