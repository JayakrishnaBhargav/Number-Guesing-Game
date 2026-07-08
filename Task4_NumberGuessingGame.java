import java.util.Random;
import java.util.Scanner;

public class Task4_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int target = random.nextInt(100) + 1; // 1 to 100
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("===== Number Guessing Game =====");
        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it!");

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess;
            try {
                guess = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            attempts++;

            if (guess < target) {
                System.out.println("Too low! Try again.");
            } else if (guess > target) {
                System.out.println("Too high! Try again.");
            } else {
                guessedCorrectly = true;
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
        }

        sc.close();
    }
}
