import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressions {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Charlie");
        names.add("Bob");

        // Sorting using Lambda
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted names: " + names);
    }
}