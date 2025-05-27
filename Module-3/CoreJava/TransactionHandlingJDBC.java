import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionHandlingJDBC {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
            conn.setAutoCommit(false);

            PreparedStatement debitStmt = conn.prepareStatement("UPDATE accounts SET balance=balance-? WHERE id=?");
            debitStmt.setInt(1, 500);
            debitStmt.setInt(2, 1);
            debitStmt.executeUpdate();

            PreparedStatement creditStmt = conn.prepareStatement("UPDATE accounts SET balance=balance+? WHERE id=?");
            creditStmt.setInt(1, 500);
            creditStmt.setInt(2, 2);
            creditStmt.executeUpdate();

            conn.commit();
            conn.close();
            System.out.println("Transaction completed.");
        } catch (Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}