package application;

public class Account {


	private double balance; // declaration of balance which will be used in every function


	// Constructor initial balance
	public Account(double openingBal)
	{
	    balance = openingBal;
	}


	// Function to return current balance of the account.
	public double getBalance()
	{
		return balance;
	}


	// Function to withdraw certain amount from the account.
	public synchronized void withdraw(double amt)
	{
		if (balance >= amt) // allows withdrawal only if balance is sufficient
		{
			balance = balance - amt;
			System.out.println("$" + amt + " Withdrawn.");
			System.out.println("New Balance : $" + balance);
		}
		else
		{
			System.out.println("You dont have enough balance to withdraw $" + amt );
		}
	}


	// Function to deposit amount to the account.
	protected synchronized void deposit(double amt)
	{
		balance = balance + amt; //adds deposit amount into balance
		System.out.println("$" + amt + " Deposited.");
		System.out.println("New Balance : $" + balance);
	}


}
