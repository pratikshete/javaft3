import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableDemo {

	public static void main(String[] args) {
		Connection conn = null;

		try {
			conn = JdbcUtil.getConnection();
			CallableStatement stat = conn.prepareCall("call getName(?,?)");
			stat.registerOutParameter(1, 123);
			stat.registerOutParameter(2, Types.VARCHAR);
			stat.execute();
			System.out.println("Name:" + stat.getString(100));

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
