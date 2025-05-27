import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student names (type 'stop' to finish):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("stop")) break;
            students.add(name);
        }

        System.out.println("Students list:");
        for (String student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}