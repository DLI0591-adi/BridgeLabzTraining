package Day18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDataUsingPrepareStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:postgresql://localhost:5432/inventory_db";
        String UserName = "postgres";
        String password = "toothbrush";
        String queryStatement = "insert into products (product_name,product_price,product_quantity) values (?,?,?)";

        try{
            Connection conn = DriverManager.getConnection(url,UserName,password);
            System.out.println("Connection with database is Successful");
            PreparedStatement ps = conn.prepareStatement(queryStatement);
            System.out.print("Enter the number of records to insert");
            int n=sc.nextInt();
            sc.nextLine();
            while (n-->0){
                System.out.print("Product Name : ");
                ps.setString(1,sc.nextLine());
                System.out.print("Product_Price : ");
                ps.setInt(2,sc.nextInt());
                System.out.print("Product_Quantity : ");
                ps.setInt(3,sc.nextInt());
                sc.nextLine();
                ps.addBatch();
            }
            int []rowsInserted = ps.executeBatch();
            System.out.println(rowsInserted.length+" row(s) inserted!");
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}