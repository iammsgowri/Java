package javaencapsulation;

public class LoginMain {

	public static void main(String[] args) {

		Login login = new Login();

		// login.username = "Gowri";
		// The field Login.username is not visible

		login.setUsername("Gowri");
		System.out.println("Username: " + login.getUsername());

		login.setPassword("IAMG@104622");
		System.out.println("Password: " + login.getPassword());

	}

}
