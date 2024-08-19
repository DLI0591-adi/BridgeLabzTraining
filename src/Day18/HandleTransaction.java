package Day18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HandleTransaction {
    private static final String URL = "jdbc:postgresql://localhost:5432/bank_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "toothbrush";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            conn.setAutoCommit(false);
            String withdrawSQL = "UPDATE accounts SET account_balance = account_balance - ? WHERE account_id = ?";
            String depositSQL = "UPDATE accounts SET account_balance = account_balance + ? WHERE account_id = ?";
            pstmt1 = conn.prepareStatement(withdrawSQL);
            pstmt2 = conn.prepareStatement(depositSQL);
            pstmt1.setInt(1, 100); // Amount to transfer
            pstmt1.setInt(2, 1); // Source account ID

            pstmt2.setDouble(1, 100); // Amount to transfer
            pstmt2.setInt(2, 2); // Destination account ID

            // Execute the statements
            pstmt1.executeUpdate();
            pstmt2.executeUpdate();

            // Commit the transaction
            conn.commit();
            System.out.println("Transaction completed successfully.");

        } catch (SQLException e) {
            // Roll back the transaction in case of an error
            if (conn != null) {
                try {
                    conn.rollback();
                    System.out.println("Transaction rolled back due to an error.");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (pstmt1 != null) pstmt1.close();
                if (pstmt2 != null) pstmt2.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
