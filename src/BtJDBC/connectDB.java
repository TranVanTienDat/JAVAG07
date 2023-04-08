package BtJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDB {
  public static Connection getConnection() throws ClassNotFoundException, SQLException {
	  Class.forName("org.sqlite.JDBC");
	  Connection con = DriverManager.getConnection("jdbc:sqlite:21T1020291.db");
		return con;
  }
}
