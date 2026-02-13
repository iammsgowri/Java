package javaconstructoroverloading;

public class Login {

	public Login(String email, String password) {
		System.out.println("User entered email and password ");
		System.out.println("Email: " + email + " " + "Password: " + password);
	}

	public Login(String email, int OTP) {
		System.out.println("User entered email and OTP ");
		System.out.println("Email: " + email + " " + "OTP: " + OTP);

	}

	public Login(long mobileNumber, String password) {
		System.out.println("User entered mobileNumber and password ");
		System.out.println("Mobile Number: " + mobileNumber + " " + "Password: " + password);

	}

	public Login(long mobileNumber, int OTP) {
		System.out.println("User entered mobileNumber and OTP ");
		System.out.println("Mobile Number: " + mobileNumber + " " + "OTP: " + OTP);

	}

	public Login(String username, String password, int OTP) {
		System.out.println("User entered username and password and OTP ");
		System.out.println("Username: " + username + " " + "Password: " + password + " " + "OTP: " + OTP);

	}

	public static void main(String[] args) {

		Login loginusingMobileOTP = new Login(987654321L, 985632);
		Login loginusingMobilePwd = new Login(9872145630L, "IAMG$104");
		Login loginusingEMOTP = new Login("emailtogowri@gmail.com", 258741);
		Login loginusingEMPwd = new Login("emailmegowri@gmail.com", "IAMG@104");
		Login loginusingEMPwdOTP = new Login("egowri@gmail.com", "IAMG$789", 1258963);

	}

}
