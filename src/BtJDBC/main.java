package BtJDBC;

import java.sql.SQLException;
import java.util.List;

public class main {
	public void main(String[] args) throws ClassNotFoundException, SQLException {
		
		List<Category> ls = Category.getListCategory();
		for(Category item : ls) {
			System.out.println(item.toString());
		}
	
	List<Product> lspd = Product.getListProductOfCategory(1);
	for(Product item : lspd) {
		System.out.println(item.toString());
	}
 }

}
