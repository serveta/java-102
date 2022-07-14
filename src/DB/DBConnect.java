package DB;

import java.sql.*;

public class DBConnect {
    public static void main(String[] args) {
        final String DB_URL = "jdbc:postgresql:dvdrental";
        final String DB_USER = "postgres";
        final String DB_PASSWORD = "postgresql";

        Connection connection;
        Statement statement;
        ResultSet resultSet;

        String getSomeData = "SELECT * FROM actor ORDER BY actor_id ASC LIMIT 5";

        try{
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(getSomeData);
            getData(resultSet);
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void getData(ResultSet resultSet) {
        try {
            while (resultSet.next()){
                System.out.println("ID: " + resultSet.getInt("actor_id"));
                System.out.println("First Name: " + resultSet.getString("first_name"));
                System.out.println("Last Name: " + resultSet.getString("last_name"));
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
