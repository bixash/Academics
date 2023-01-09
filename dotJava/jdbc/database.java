// 1. Assuming your own database and tables write a program using JDBC to enter and
// display data from the database. Use GUI form to enter and display data.

import java.sql.*;

public class database {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pascal", "root", "");
            Statement stmt = conn.createStatement();
            String sqlStmt = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(sqlStmt);

            while (rs.next())
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3));
                
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
