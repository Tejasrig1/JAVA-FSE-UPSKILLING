public class TypeCastingExample {
    public static void main(String[] args) {
        double d = 9.7;
        int i = (int) d; // Explicit cast

        int num = 7;
        double converted = num; // Implicit cast

        System.out.println("Double to Int: " + i);
        System.out.println("Int to Double: " + converted);
    }
}