import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        int sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = sum / (double) size;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        scanner.close();
    }
}