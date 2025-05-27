import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        int guess = -1; // Initialized to -1 to ensure the loop runs
       
        System.out.println("Guess a number between 1 and 100:");

        while (guess != number) {
            if (sc.hasNextInt()) { // Ensure valid integer input
                guess = sc.nextInt();

                if (guess < 1 || guess > 100) {
                    System.out.println("Invalid input! Enter a number between 1 and 100:");
                } else if (guess < number) {
                    System.out.println("Too low! Try again:");
                } else if (guess > number) {
                    System.out.println("Too high! Try again:");
                } else {
                    System.out.println("Correct! You guessed it!");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // Consume invalid input
            }
        }

        sc.close(); // Close Scanner to prevent resource leak
    }
}