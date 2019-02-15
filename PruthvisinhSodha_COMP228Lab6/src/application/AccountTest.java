package application;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountTest {

	public static void main(String[] args) {

        Account acc = new Account(100.00); 		// Starting Account Balance defined

		System.out.println( "Creating threads..." );


		// Create Threads with a new targeted runnable
		Transaction trans1 =  new Transaction(200.00, "Withdraw", acc) ;
		Transaction trans2 = new Transaction(300.00, "Deposit", acc) ;
		Transaction trans3 = new Transaction(50.00, "Withdraw", acc) ;
		Transaction trans4 = new Transaction(150.00, "Deposit", acc) ;
		Transaction trans5 = new Transaction(440.00, "Withdraw", acc) ;


		// Arrays to create transaction objects
        ArrayList<Transaction> transactionArray = new ArrayList<>();
        transactionArray.add(trans1);
        transactionArray.add(trans2);
        transactionArray.add(trans3);
        transactionArray.add(trans4);
        transactionArray.add(trans5);


        // Create ExecutorService to manage threads
        ExecutorService executorService = Executors.newCachedThreadPool();

        for(Transaction transaction : transactionArray)
        {
            executorService.execute(transaction);
        }


	}
}
