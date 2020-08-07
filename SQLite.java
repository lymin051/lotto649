import java.sql.*;

public class SQLite {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			String url = "jdbc:sqlite:/Applications/lotto649.db";
			conn = DriverManager.getConnection(url);
			System.out.println("Sucessfully connected to SQLite DB!");
			
			String query = "SELECT * FROM lotto649_2014";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println("獎號：["+rs.getInt("獎號1")+" "+rs.getInt("獎號2")+" "
										   +rs.getInt("獎號3")+" "+rs.getInt("獎號4")+" "
										   +rs.getInt("獎號5")+" "+rs.getInt("獎號6")+"]\t"+
								   "特別號：["+rs.getInt("特別號")+"]");
				}
		} catch(Exception e) {
			System.err.println("Exception: " + e.getMessage());
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch(SQLException e) {}
		}

	}

}
