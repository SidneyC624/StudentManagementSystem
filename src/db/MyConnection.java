package db;
import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

	private static final String username = "root";
	private static final String password = "fbcUd8J12$";
	private static final String url = "jdbc:mysql://localhost:3306/student_management";
	private static Connection con = null;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return con;
	}
}
  