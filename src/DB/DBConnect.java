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
        String updateDataSQL = "UPDATE actor SET first_name = ? WHERE actor_id = ?";
        String deleteDataSQL = "DELETE FROM actor WHERE actor_id = ?";

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            getData(connection, getSomeDataSQL);
            insertData(connection,insertDataSQL);
            getData(connection, getLastDataSQL);
            updateData(connection, updateDataSQL);
            getData(connection, getLastDataSQL);
            deleteData(connection, deleteDataSQL);
            getData(connection, getLastDataSQL);

            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void getData(Connection connection, String getDataSQL) {
        Statement statement;
        ResultSet resultSet;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(getDataSQL);

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("actor_id"));
                System.out.println("First Name: " + resultSet.getString("first_name"));
                System.out.println("Last Name: " + resultSet.getString("last_name"));
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void insertData(Connection connection, String insertDataSQL) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertDataSQL);
            preparedStatement.setString(1, "Servet");
            preparedStatement.setString(2, "Arslan");
            preparedStatement.executeUpdate();

            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void updateData(Connection connection, String updateDataSQL) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateDataSQL);
            preparedStatement.setString(1, "Deniz");
            preparedStatement.setInt(2, 201);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void deleteData(Connection connection, String deleteDataSQL) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteDataSQL);
            preparedStatement.setInt(1, 202);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
