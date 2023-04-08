package OOP;

public class Invoice {
	int id; 
	Customer customer;
	double amount;
	public Invoice(int id, Customer customer, double amount) {
		super();
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	public int getCustomerID() {
		return customer.id;
	}
	public String getCustomerName() {
		return customer.name;
	}
	public int getCustomerDiscount() {
		return customer.discount;
	}
	public double getAmountAfterDiscount() {
		return amount;
	}
	@Override
	public String toString() {
		return String.format("Invoice[id=%d, customer=%s, amount=%.2f]", id,customer.toString(),amount);
	}
	
}
