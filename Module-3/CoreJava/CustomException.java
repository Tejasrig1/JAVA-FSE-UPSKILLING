import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main Class
public class CustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Valid age: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
    }
}