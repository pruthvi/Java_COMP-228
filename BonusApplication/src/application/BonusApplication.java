package application;

import java.util.Scanner;

public class BonusApplication
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of arrays:");
		
		int value = input.nextInt();
		int[] numbers = new int[value];
		
		for(int index = 0; index<value; index++)
		{
			System.out.println("Enter Array values:");
			numbers[index] = input.nextInt();
		}
		
		BonusApplication self = new BonusApplication();
		
		self.isSorted(numbers, value);
		
		self.findAverage(numbers, value);

		
	}

	
	
	public boolean isSorted(int[] numbers, int value)
	{
		boolean desc = true;
		
		for(int index=0; index<value;index++)
		{
			if(numbers[index]> numbers[index-1])
			{
				System.out.println("array is in ascending order");
				desc =false;
				break;
			}
		}
		
		System.out.println("array is in descending order");
		
		return desc;
		
	}
	
	
	
	
	
	public double findAverage(int[] numbers, int value)
	{
		int sum = 0;
		double avg = 0;
		
		for(int index = 0; index<value; index++)
		{
			sum = sum + numbers[index];
		}
		
		avg = sum / value ;
		
		System.out.printf("Average  is  %f", avg);
		return avg;
		
	}
}
