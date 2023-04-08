package OOP;

//import java.util.Arrays;

public class BookV2 {
   String name;
   int qty;
   double price;
   Author[] authors;
//   List<Author> authors;
public BookV2(String name, double price, Author[] authors) {
	super();
	this.name = name;
	this.price = price;
	this.authors = authors;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getName() {
	return name;
}
public Author[] getAuthors() {
	return authors;
}
@Override
public String toString() {
	String authorStr = "";
	for(Author author : authors) {
		authorStr +=author.toString() + " ";
	}
	if(!authorStr.isEmpty()) {
		authorStr = authorStr.substring(0,authorStr.length()-1);		
	}
	return String.format("Book[name=%s, author={%s}, price=%d, qty=%d", name, authorStr,price,qty);
}
   
}
