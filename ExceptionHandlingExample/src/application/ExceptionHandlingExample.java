package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExample {

	public static void main(String[] args)
	{

		int userValue1;
		int userValue2;

		Scanner input = new Scanner(System.in);

		ExceptionHandlingExample self = new ExceptionHandlingExample();

		while(true)
		{
			try
			{
				System.out.print("Enter the First Value: ");
				userValue1 = input.nextInt();

				System.out.print("Enter the Second Value: ");
				userValue2 = input.nextInt();


				/*				if(userValue1 == 0 || userValue2== 0)
				{
					System.out.print("Value should be non zero");
					break;			
				}*/

				System.out.printf("%d / %d = %.2f \n", userValue1, userValue2, self.calcDivision(userValue1, userValue2));
			}


			catch(InputMismatchException e)
			{
				System.out.println("Invaild Value. You must enter an integer");	
				input.nextLine();
			}
			catch(ArithmeticException e)
			{
				System.out.println("Invaild Input " + e.getMessage());
			}
			catch(Exception e)
			{
				System.out.println("Something went wrong. The application will end!");

				if(e.getMessage() != null)
				{
					System.out.println(e.getMessage());
				}
				System.exit(1);
			}
			finally
			{
				input.close();
			
			}
		}


	
	}


	public double calcDivision(int num1, int num2)
	{
		if(num2 == 0)
		{
			throw new  ArithmeticException (" Your denominator can not be zero!");
		}

		return (double) num1 / num2;

	}


}
