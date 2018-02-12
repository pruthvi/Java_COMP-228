// Develop a program that prompts the user to enter an integer and checks whether the number is
// divisible by both 5 and 6, or neither of them, or just one of them. Here are some sample runs:
// 10 is divisible by 5 or 6, but not both.
// 30 is divisible by both 5 and 6.
// 23 is not divisible by either 5 or 6.

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int integer = input.nextInt();
		
		
		if((integer % 5 == 0) && (integer % 6 == 0))
		{
			System.out.printf("%d is divisible by both 5 and 6", integer);

		}
		else if((integer % 5 == 0) || (integer % 6 == 0))
		{
			System.out.printf("%d is divisible by 5 or 6, but not both", integer);

		}
		else
		{
			System.out.printf("%d is not divisible by either 5 or 6", integer);

		}
		
	}

}
