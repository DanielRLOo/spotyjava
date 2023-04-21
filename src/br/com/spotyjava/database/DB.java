package br.com.spotyjava.database;

import java.sql.*;

public class DB {
    // SQLite connection string
    private String connectionString = "jdbc:sqlite::memory:";
    
    // Connection object
    private Connection connection;

    public Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(connectionString);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            connection = null;
        }
    }

    public void execute(String sql) {
        try {
            Statement stmt = getConnection().createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            closeConnection();
        }
    }
}
