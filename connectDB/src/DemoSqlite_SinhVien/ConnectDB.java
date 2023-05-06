package DemoSqlite_SinhVien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
  public static Connection  getConnectDB() throws ClassNotFoundException, SQLException{
	  Class.forName("org.sqlite.JDBC");  
	  Connection con = DriverManager.getConnection("jdbc:sqlite:product.db"); 
	return con;
	  
	
}
}
