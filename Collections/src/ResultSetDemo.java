import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {

	public static void main(String[] args) {

		
		//String sql = "select * from product";
		

		try {
			Connection conn = JdbcUtil.getConnection();
			/*conn = JdbcUtil.getConnection();

			ResultSetMetaData meta = rs.getMetaData();
			for (int c = 1; c <= meta.getColumnCount(); c++)
				System.out.print(meta.getColumnName(c) + "\t");
			System.out.println();

			while (rs.next())
				System.out.printf("%5d\t%-15s\t%5s\n" + rs.getInt(1) + "\t" + rs.getString(2) + rs.getString(3));

		} */ 
			Statement stmt = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
ResultSet rs = stmt.executeQuery("SELECT code, name, price from product");
  rs.absolute(2);
  rs.updateString("Name", "nayaNaam");
  rs.updateRow();
  

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
			

	}

}
