package javaoopsmethods;

public class Login {

	String email;
	String password;

	public void enterEmail(String email) {
		System.out.println("Enter Email: " + email);
		System.out.println("User entered email displayed successfully");
	}

	public String enteredEmail(String email) {
		return email;
	}

	public void enterPassword(String password) {
		System.out.println("Enter Password: " + password);
		System.out.println("User entered password displayed successfully");
	}

	public String clickLogin() {
		return "User clicked login button";
	}

	public void loginSuccess() {
		System.out.println("User Loggedin successfully");
	}

	public static void main(String[] args) {

		Login user1 = new Login();
		Login user2 = new Login();

		user1.enterEmail("emgowri@gmail.com");
		user1.enterPassword("EIG$258");
		String clickLogin = user1.clickLogin();
		System.out.println(clickLogin);
		user1.loginSuccess();

		user2.enterEmail("emg@gmail.com");
		user2.enterPassword("GI@741$258");
		String clickLogin1 = user2.clickLogin();
		System.out.println(clickLogin1);
		user2.loginSuccess();

	}

}
