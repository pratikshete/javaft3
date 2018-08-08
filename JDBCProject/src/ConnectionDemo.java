import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		
		Connection conn = null;

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "training", "oracle");
			System.out.println("Connection Successful");

			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("DB Name" + meta.getDatabaseProductName());
			System.out.println("DB Ver" + meta.getDatabaseProductVersion());
			System.out.println("Driver Ver" + meta.getDriverVersion());
			System.out.println("Driver Name" + meta.getDriverName());

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}
       finally {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection Terminated");
	}
	}
	
}
