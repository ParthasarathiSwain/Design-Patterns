package SingletonBestApproach;

import java.sql.Connection;

public class Test {
	public static void main(String[] args) {
        UserDAO dao = new UserDAO();
        dao.insertUser();

        // Confirm only one connection is used
        Connection conn1 = DBConnection.INSTANCE.getConnection();
        Connection conn2 = DBConnection.INSTANCE.getConnection();
        System.out.println("Same connection? " + (conn1 == conn2));  // true
    }
}
