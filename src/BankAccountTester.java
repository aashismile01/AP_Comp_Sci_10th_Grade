import java.util.Scanner;

public class BankAccountTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Create BankAccount objects
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		BankAccount account3 = account1;

		// Ask the user for account information
		System.out.print("Enter Account 1 Account Number: ");
		int accountNumber1 = input.nextInt();
		System.out.print("Enter Account 1 Initial Balance: $");
		double initialBalance1 = input.nextDouble();

		// Perform transactions for Account 1 Deposit
		System.out.print("Enter the deposit amount for Account 1: $");
		double depositAmount1 = input.nextDouble();
		account1.deposit(depositAmount1);

		// Ask the user for account information
		System.out.print("\nEnter Account 2 Account Number: ");
		int accountNumber2 = input.nextInt();
		System.out.print("Enter Account 2 Initial Balance: $");
		double initialBalance2 = input.nextDouble();

		// Perform transactions for Account 2 Withdrawal
		System.out.print("Enter the withdrawal amount for Account 2: $");
		double withdrawalAmount2 = input.nextDouble();
		account2.withdraw(withdrawalAmount2);

		// Set the account information
		account1.setAccountNumber(accountNumber1);
		account1.setBalance(initialBalance1);

		account2.setAccountNumber(accountNumber2);
		account2.setBalance(initialBalance2);
		
		// Ask for the interest rate
		System.out.print("\nEnter the annual interest rate: ");
		double interestRate = input.nextDouble();

		// Calculate and display monthly interest
		double monthlyInterestAccount1 = account1.calculateMonthlyInterest(interestRate);
		double monthlyInterestAccount2 = account2.calculateMonthlyInterest(interestRate);

		System.out.println("\nAccount 1 - Account Number: " + account1.getAccountNumber());
		System.out.println("Account 1 - Balance: $" + account1.getBalance());
		System.out.println("Account 1 - Monthly Interest: $" + monthlyInterestAccount1);

		System.out.println("\nAccount 2 - Account Number: " + account2.getAccountNumber());
		System.out.println("Account 2 - Balance: $" + account2.getBalance());
		System.out.println("Account 2 - Monthly Interest: $" + monthlyInterestAccount2);

		input.close();
	}
}