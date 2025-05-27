import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertUpdateJDBC {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");

            PreparedStatement insertStmt = conn.prepareStatement("INSERT INTO students (name, age) VALUES (?, ?)");
            insertStmt.setString(1, "Alice");
            insertStmt.setInt(2, 22);
            insertStmt.executeUpdate();

            PreparedStatement updateStmt = conn.prepareStatement("UPDATE students SET age=? WHERE name=?");
            updateStmt.setInt(1, 23);
            updateStmt.setString(2, "Alice");
            updateStmt.executeUpdate();

            conn.close();
            System.out.println("Insert and Update operations completed.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}