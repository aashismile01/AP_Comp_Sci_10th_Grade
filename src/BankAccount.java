public class BankAccount {
	// Attributes
	private int accountNumber;
	private double balance;

	// Constructors
	public BankAccount() {
		// Default Constructor
		accountNumber = 0; // Default account number
		balance = 0.0; // Default balance
	}

	public BankAccount(int accountNumber, double balance) {
		// Constructor with Parameters
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public BankAccount(int accountNumber) {
		// Constructor with Parameters
		this.accountNumber = accountNumber;
		balance = 0.0;
	}

	// Accessor Methods (Getters)
	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	// Mutator Methods (Setters)
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Functionality Methods
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	} 

	public double calculateMonthlyInterest(double interestRate) {
		double monthlyInterest = (balance * (interestRate / 100)) / 12;

		// Format the result to two decimal places and return it as a double
		return Double.parseDouble(String.format("%.2f", monthlyInterest));
	}

	// toString method
	public String toString() {
		return "Account Number: " + accountNumber + "\nBalance: $" + balance;
	}
}