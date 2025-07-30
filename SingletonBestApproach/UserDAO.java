package SingletonBestApproach;

import java.sql.Connection;
import java.sql.Statement;

public class UserDAO {
    public void insertUser() {
        try {
            Connection conn = DBConnection.INSTANCE.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO users(name) VALUES ('Parth')");
            System.out.println("✅ User inserted into DB.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
