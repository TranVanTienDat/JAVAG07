package OOP;

public class Employee {
	private int id; String firstName; String lastName; int salary;
	Employee(int id,String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getID() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getSalary() {
		return salary;
	}
	public String getName() {
		return String.format("%s %s",lastName,firstName );
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int setAnnualSalary(int salary) {
		return salary * 12;
	}
	
	public String toString () {
		return String.format("emp[id=%d, name= %s %s, salary= %d]", id,firstName,lastName,salary);
	}
}
