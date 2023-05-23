package jm.task.core.jdbc.util;
import java.sql.*;

public class Util {
    private final static String URL = "jdbc:mysql://localhost:3306/testbyafanta";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "567tesla765";
    public static Connection getConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("OK");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
