package Day18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishABasicConnection {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/test_db";
        String UserName = "postgres";
        String password = "toothbrush";
        try{
            Connection conn = DriverManager.getConnection(url,UserName,password);
            System.out.println("Connection with database is successful");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}