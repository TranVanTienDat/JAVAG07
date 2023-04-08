package OOP;

public class Author {
	String name, email;
	char gender;
	public Author(String name, String email, char gender) {
		super();
		this.email = email;
		this.name = name;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Author [getGender()=" + getGender() + "]";
	}
	
	
}
