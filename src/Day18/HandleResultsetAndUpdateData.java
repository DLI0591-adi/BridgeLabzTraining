package Day18;

import java.sql.*;

public class HandleResultsetAndUpdateData {
    private static final String URL = "jdbc:postgresql://localhost:5432/school_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "toothbrush";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstprintall = null;
        PreparedStatement pstupdate = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            conn.setAutoCommit(false);
            String printall = "select * from student";
            String update = "UPDATE student SET grade = ? WHERE Student_id = ?";
            pstprintall = conn.prepareStatement(printall);
            pstupdate = conn.prepareStatement(update);
            printTable(pstprintall);
            pstupdate.setString(1,"A+");
            pstupdate.setInt(2,1);
            pstupdate.executeUpdate();
            printTable(pstprintall);
            System.out.println("Grades Updated successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static void printTable(PreparedStatement ps) throws SQLException {
        ResultSet rs = ps.executeQuery();
        int columnCount = rs.getMetaData().getColumnCount();
        for (int i=1;i<=columnCount;i++){
            System.out.print(rs.getMetaData().getColumnName(i)+"\t");
        }
        System.out.println();
        while (rs.next()){
            for(int i=1;i<=columnCount;i++){
                System.out.print(rs.getString(i)+"\t");
            }
            System.out.println();
        }
    }

}
