package DB;

import java.sql.*;

public class DBConnect {
    public static void main(String[] args) {
        final String DB_URL = "jdbc:postgresql:dvdrental";
        final String DB_USER = "postgres";
        final String DB_PASSWORD = "postgresql";

        Connection connection;

        String getSomeDataSQL = "SELECT * FROM actor ORDER BY actor_id ASC LIMIT 5";
        String insertDataSQL = "INSERT INTO actor (first_name,last_name) VALUES (?,?)";
        String getLastDataSQL = "SELECT * FROM actor ORDER BY actor_id DESC LIMIT 1";

        try{
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            getData(connection, getSomeDataSQL);
            insertData(connection,insertDataSQL);
            getData(connection, getLastDataSQL);

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void getData(Connection connection, String getDataSQL) {
        Statement statement;
        ResultSet resultSet;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(getDataSQL);

            while (resultSet.next()){
                System.out.println("ID: " + resultSet.getInt("actor_id"));
                System.out.println("First Name: " + resultSet.getString("first_name"));
                System.out.println("Last Name: " + resultSet.getString("last_name"));
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    static void insertData(Connection connection, String insertDataSQL) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertDataSQL);
            preparedStatement.setString(1,"Servet");
            preparedStatement.setString(2,"Arslan");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
