package application;

import java.security.SecureRandom;
import javax.swing.JOptionPane;

public class Exercise2 {

	public static void main(String[] args) {

		//Generating Random Numbers, along with its sum
		SecureRandom randomnumbers = new SecureRandom();

		int sum = 0;
		for(int counter=0; counter<=5; counter++)
		{

			int face = 1 + randomnumbers.nextInt(5);
			sum = sum + face;
		}

		//Dialog box with Error Messages
		String errorMessage = "";
		do {
			// Show input dialog with current error message, if any
			String sInput = JOptionPane.showInputDialog(errorMessage + "Enter Number:");
			try {
				int number = Integer.parseInt(sInput);
				if (number > 27 || number < 3)
				{
					errorMessage = "Only numbers between 3 to 27 are allowed \n";
				}
				else
				{

					if(sum == number)
					{
						JOptionPane.showMessageDialog(null, "The number you chose is " + number + ". Congrats, you have won the lottery!");

					}
					else
					{
						JOptionPane.showMessageDialog(null, "Sorry! Winner lotter numbery is " + sum +". You Lost!");
					}
					errorMessage = ""; // no more error
				}

			}
			catch (NumberFormatException e) {
				// The typed text was not an integer
				errorMessage = "The text you typed is not a number.\n";
			}
		} while (!errorMessage.isEmpty());
	}
}



