package SingletonBestApproach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum DBConnection {
    INSTANCE;

    private Connection connection;

    DBConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/your_database";
            String user = "root";
            String password = "admin";
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Database connection created.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
