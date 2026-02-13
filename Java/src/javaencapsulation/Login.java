package javaencapsulation;

public class Login {

	private String username;
	private String password;

	String getUsername() {
		return username;
	}

	void setUsername(String username) {
		this.username = username;
	}

	String getPassword() {
		return password;
	}

	void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) {

		Login login = new Login();
		login.setUsername("Gowri");
		System.out.println("Username: " + login.getUsername());

		login.setPassword("IAMG@104622");
		System.out.println("Password: " + login.getPassword());

	}

}
