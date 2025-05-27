import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;

        System.out.println("Guess a number between 1 and 100:");
        do {
            guess = scanner.nextInt();
            if (guess < secretNumber) System.out.println("Too low!");
            else if (guess > secretNumber) System.out.println("Too high!");
        } while (guess != secretNumber);

        System.out.println("Correct! The number was " + secretNumber);
        scanner.close();
    }
}