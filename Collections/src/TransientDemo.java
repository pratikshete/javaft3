import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class TransientDemo {

	public static void main(String[] args) {

		Connection conn = null;

		String sql1 = "insert into product values(112,'White Board',500)";
		String sql2 = "update product set price = 30 where code = 123";
		String sql3 = "delete from product where code = 121";

		try {
			conn = JdbcUtil.getConnection();
			conn.setAutoCommit(false);

			Statement stmt = conn.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);

			stmt.executeBatch();
			conn.commit();

			System.out.println("Transaction Complete");
		} catch (SQLException e3) {
			System.out.println("Transaction failed");

			try {
				conn.rollback();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} finally {
				try {
					if (conn != null)
						conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

}
