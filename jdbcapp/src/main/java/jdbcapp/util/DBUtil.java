package jdbcapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	
	private static String username = "postgres";
	private static String password = "password";
	private static String url = "jdbc:postgresql://localhost:5432/scbdb";

	public static Connection getDBConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}

