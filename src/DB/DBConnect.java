package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static void main(String[] args) {
        Connection connection = null;

        final String DB_URL = "jdbc:postgresql:dvdrental";
        final String DB_USER = "postgres";
        final String DB_PASSWORD = "postgresql";

        try{
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
