package javamethodoverloading;

// method overloading 

public class Login {

	public void login(String email, String password) {
		System.out.println("User entered email and password ");
		System.out.println("Email: " + email + " " + "Password: " + password);
	}

	public void login(String email, int OTP) {
		System.out.println("User entered email and OTP ");
		System.out.println("Email: " + email + " " + "OTP: " + OTP);

	}

	public void login(long mobileNumber, String password) {
		System.out.println("User entered mobileNumber and password ");
		System.out.println("Mobile Number: " + mobileNumber + " " + "Password: " + password);

	}

	public void login(long mobileNumber, int OTP) {
		System.out.println("User entered mobileNumber and OTP ");
		System.out.println("Mobile Number: " + mobileNumber + " " + "OTP: " + OTP);

	}

	public void login(String username, String password, int OTP) {
		System.out.println("User entered username and password and OTP ");
		System.out.println("Username: " + username + " " + "Password: " + password + " " + "OTP: " + OTP);

	}

	public static void main(String[] args) {

		Login login = new Login();
		
		login.login(987654321L, 985632);
		login.login(9872145630L, "IAMG$104");
		login.login("emailtogowri@gmail.com", 258741);
		login.login("emailmegowri@gmail.com", "IAMG@104");
		login.login("egowri@gmail.com", "IAMG$789", 1258963);

	}

}
