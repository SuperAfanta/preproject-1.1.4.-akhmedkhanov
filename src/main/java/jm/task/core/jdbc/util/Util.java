package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class Util {
    private final static String URL = "jdbc:mysql://localhost:3306/testbyafanta";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "567tesla765";
    private final static Logger LOGGER = Logger.getLogger(Util.class.getName());

    public static Connection getConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            LOGGER.info("Connection established");
        } catch (SQLException e) {
            LOGGER.severe("Error establishing connection: " + e.getMessage());
            throw new RuntimeException(e);
        }
        return connection;
    }
}
