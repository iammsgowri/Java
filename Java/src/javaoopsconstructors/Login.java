package javaoopsconstructors;

public class Login {

	String username;
	String password;

	Login(String username, String password) {
		this.username = username;
		this.password = password;
	}

	void printUserData() {
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	public static void main(String[] args) {

		Login user1 = new Login("Gowri", "IAMG$104622");
		user1.printUserData();

		Login user2 = new Login("IAMGowri", "IAMG$6221004");
		user2.printUserData();

	}

}
