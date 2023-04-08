package BtJDBC;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
public class Category {
  private int ID;
  private String Name;
public int getID() {
	return ID;
}

public Category(int iD, String name) {
	super();
	ID = iD;
	Name = name;
}

public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}

@Override
public String toString() {
	return "Category [ID=" + ID + ", Name=" + Name + "]";
}

public static List<Category> getListCategory() throws SQLException, ClassNotFoundException{
	Connection con = connectDB.getConnection();
	Statement state = con.createStatement();
	String sql = "SELECT * FROM Category ORDER BY Name ASC";
	ResultSet rs = state.executeQuery(sql);
	List<Category> ls = new ArrayList<>();
	while(rs.next()) {
		int id = rs.getInt("ID");
		String name = rs.getString("Name");
		ls.add(new Category(id,name));
	}
	con.close();
	return ls;
}

public static int createCategory(String name) throws SQLException, ClassNotFoundException {
	Connection con = connectDB.getConnection();
	Statement state = con.createStatement();
	String sql = "INSERT INTO Category(Name) VALUES ('"+name+"')";
	int rs = state.executeUpdate(sql);
	con.close();
	return rs;
}

public static int editCategory(int id, String name) throws ClassNotFoundException, SQLException {
	Connection con = connectDB.getConnection();
	Statement state = con.createStatement();
	List<Category> ls = Category.getListCategory();
	for(Category item : ls) {
		if(item.ID == id) {
			String sql = "UPDATE Category\n"
					+ "SET Name = '"+name+"'\n"
					+ "WHERE ID = " + id;
			int rs = state.executeUpdate(sql);
			con.close();
			return rs;
		}
	}
	con.close();
	return 0;
}

public static int deleteCategory(int id) throws ClassNotFoundException, SQLException {
	Connection con = connectDB.getConnection();
	Statement state = con.createStatement();
	List<Category> ls = Category.getListCategory();
	for(Category item : ls) {
		if(item.ID == id) {
			List<Product> lspd = Product.getListProductOfCategory(id);
			if(lspd.size()==0) {
				String sql = "DELETE FROM Category\n"
						+ "WHERE ID = " + id;
				int rs = state.executeUpdate(sql);
				con.close();
				return rs;
			}
			return -1;
		}
	}
	con.close();
	return 0;
}
public static void ThongKe() throws ClassNotFoundException, SQLException {
	List<Category> ls = Category.getListCategory();
	for(Category item : ls) {
		List<Product> lspd = Product.getListProductOfCategory(item.getID());
		System.out.println(item.toString() + " Tong so san pham: " + lspd.size());
	}
}

  
}
