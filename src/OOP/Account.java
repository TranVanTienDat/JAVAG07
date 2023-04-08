package OOP;

public class Account {
	String id; String name; int balance;


	
	
	public Account(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.balance = 0;
	}



	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}



	public String getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public int getBalance() {
		return balance;
	}
	
	public int credit(int amount) {
		balance+=amount;
		return balance;
	}
	
	public int debit(int amount) {
		if(amount <= balance) {
			balance-=amount;
		}
		else {
			System.out.print("amount exceeded balance");
		}
		return balance;
	}
	
	public int TransferTo(Account another, int amount) {
		if(amount <= balance) {
			
		}
		else {
			System.out.print("amount exceeded balance");
		}
		return balance;
	}



	@Override
	public String toString() {
		return  String.format("Account[id=%d, name=%s, balance=%d]", id,name, balance);
	}
	
	
}
