package javaoopsmethods;

public class Account {

	String accountHolderName;
	double amount;

	public void openAccount(String accountHolderName, double amount) {
		this.accountHolderName = accountHolderName;
		this.amount = amount;
	}

	public void displayAccountDetails() {
		System.out.println("Account Created Successfully");
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Account Amount: " + amount);
	}

	public void checkBalance() {
		System.out.println("Check Balance: " + amount);
	}

	public void depositAmount(double depositAmount) {
		amount = amount + depositAmount;
		System.out.println("Deposit Amount: " + depositAmount);

	}

	public void withdrawAmount(double withdrawAmount) {
		amount = amount - withdrawAmount;
		System.out.println("Withraw Amount: " + withdrawAmount);
	}

	public static void main(String[] args) {

		Account account = new Account();
		account.openAccount("Gowri", 40000);
		account.displayAccountDetails();
		account.depositAmount(40000);
		account.checkBalance();
		account.withdrawAmount(20000);
		account.checkBalance();

	}

}
