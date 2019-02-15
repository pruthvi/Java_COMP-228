package application;

public class Transaction implements Runnable {

	//declarations
	private final Account account;
	private final double trans;
	private final String op;	 // checks whether it is deposit or withdrawal

	// Constructor
	public Transaction(double transaction, String operation, Account acc)
	{
		trans = transaction;
		op = operation;
		account=acc;
	}

	// run function
	public void run()
	{
		try
		{
			if(op == "Deposit") 			// checks whether operation is deposit
			{
				account.deposit(trans);		// deposits amount in Account class
			}
			else if(op == "Withdraw")		// checks whether operation is withdrawal
			{
				account.withdraw(trans);	// withdraws amount from balance in Account class
			}
			else
			{
				System.out.println("Invalid Operation"); 	//Triggers if invalid or null operation is called
			}

		}
		catch(NullPointerException e)		 // Exception handling
		{
			System.out.println("Error Detected:" + e);
		}

}

}
