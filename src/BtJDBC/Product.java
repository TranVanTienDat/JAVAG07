package BtJDBC;
import java.sql.*;
import java.util.*;
public class Product {
	private int ID;
	private String Name;
	private int Price;
	private int Quantity;
	private int IDCategory;
	public Product(int iD, String name, int price, int quantity, int iDCategory) {
		super();
		ID = iD;
		Name = name;
		Price = price;
		Quantity = quantity;
		IDCategory = iDCategory;
	}
	
	




	@Override
	public String toString() {
		return "Product [ID=" + ID + ", Name=" + Name + ", Price=" + Price + ", Quantity=" + Quantity + ", IDCategory="
				+ IDCategory + "]";
	}
	public static List<Product> getListProduct() throws SQLException, ClassNotFoundException{
		Connection con = connectDB.getConnection();
		Statement state = con.createStatement();
		String sql = "SELECT * FROM Product";
		ResultSet rs = state.executeQuery(sql);
		List<Product> ls = new ArrayList<>();
		while(rs.next()) {
			int id = rs.getInt("ID");
			String name = rs.getString("Name");
			int price = rs.getInt("Price");
			int quantity = rs.getInt("Quantity");
			int iDCategory = rs.getInt("IDCategory");
			ls.add(new Product(id,name,price,quantity,iDCategory));
		}
		con.close();
		return ls;
	}
	

	public static List<Product> getListProductOfCategory(int idct) throws SQLException, ClassNotFoundException{
		Connection con = connectDB.getConnection();
		Statement state = con.createStatement();
		String sql = "SELECT P.ID,P.Name, P.Price, P.Quantity, P.IDCategory\n"
				+ "FROM Product as P INNER JOIN Category as C\n"
				+ "ON P.IDCategory = C.ID\n"
				+ "WHERE P.IDCategory = "+idct+"\n"
				+ "Order By P.price DESC";
		ResultSet rs = state.executeQuery(sql);
		List<Product> ls = new ArrayList<>();
		while(rs.next()) {
			int id = rs.getInt("ID");
			String name = rs.getString("Name");
			int price = rs.getInt("Price");
			int quantity = rs.getInt("Quantity");
			int iDCategory = rs.getInt("IDCategory");
			ls.add(new Product(id,name,price,quantity,iDCategory));
		}
		con.close();
		return ls;
	}
	
	public static int createProduct(String name,int price, int quantity, int idcategory) throws ClassNotFoundException, SQLException {
		Connection con = connectDB.getConnection();
		Statement state = con.createStatement();
		List<Product> lspd = Product.getListProduct();
		for(Product item : lspd) {
			if(item.Name.equals(name)) {
				con.close();
				return 0;
			}
		}
		String sql ="INSERT INTO Product (Name,Price,Quantity,IDCategory)\n"
				+ "VALUES ('"+name+"',"+price+","+quantity+","+idcategory+")";
		int rs = state.executeUpdate(sql);
		con.close();
		return rs;
	}
	
	static boolean checkProductNameExist(int id,String name) throws ClassNotFoundException, SQLException {
		Connection con = connectDB.getConnection();
		Statement state = con.createStatement();
		List<Product> lspd = Product.getListProduct();
		for(Product item : lspd) {
			if(item.ID != id && (item.Name).equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	public static int editProduct(int id,String name,int price, int quantity, int idcategory) throws ClassNotFoundException, SQLException {
		Connection con = connectDB.getConnection();
		Statement state = con.createStatement();
		List<Product> lspd = Product.getListProduct();
		for(Product item : lspd) {
			if(item.ID == id) {
				if(Product.checkProductNameExist(id, name)==false) {
					String sql ="UPDATE Product\n"
							+ "SET Name = '"+name+"', Price = "+price+", Quantity="+quantity+",IDCategory="+idcategory+"\n"
							+ "WHERE ID =" + id;
					int rs = state.executeUpdate(sql);
					con.close();
					return rs;
				}
				else {
					con.close();
					return -1;
				}
			}
		}
		con.close();
		return 0;
	}
	
	public static int deleteProduct(int id) throws ClassNotFoundException, SQLException {
		Connection con = connectDB.getConnection();
		Statement state = con.createStatement();
		List<Product> lspd = Product.getListProduct();
		for (Product item : lspd) {
			if(item.ID == id) {
				String sql ="DELETE FROM Product WHERE ID =" + id;
				int rs = state.executeUpdate(sql);
				con.close();
				return rs;
			}
		}
		return 0;
	}
	
}
