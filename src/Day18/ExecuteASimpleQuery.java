package Day18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExecuteASimpleQuery {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/company_db";
        String UserName = "postgres";
        String password = "toothbrush";
        String sqlStatement = "select * from employee";
        try{
            Connection conn= DriverManager.getConnection(url,UserName,password);
            System.out.println("Connection with database is successful");
            PreparedStatement ps= conn.prepareStatement(sqlStatement);
            ResultSet rs= ps.executeQuery();
            int columnCount = rs.getMetaData().getColumnCount();
            for (int i=1;i<=columnCount;i++){
                System.out.print(rs.getMetaData().getColumnName(i)+"\t");
            }
            System.out.println();
            while (rs.next()){
                for(int i=1;i<=columnCount;i++){
                    System.out.print(rs.getString(i)+"\t\t");
                }
                System.out.println();
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
