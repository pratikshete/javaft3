import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedDemo {

	public static void main(String[] args) {

		String sql = "insert into product values(?,?,?)";
		Connection conn = null;

		try {
			conn = JdbcUtil.getConnection();
			PreparedStatement stat = conn.prepareStatement(sql);
			stat.setInt(1, Integer.parseInt(args[0]));
			stat.setString(2, args[1]);
			stat.setDouble(3, Double.parseDouble(args[2]));
			stat.executeUpdate();
			System.out.println("Record Inserted");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
