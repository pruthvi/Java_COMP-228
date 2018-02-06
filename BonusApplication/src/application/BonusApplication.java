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
		
		
		boolean result = self.isSorted(numbers, value);
		if(result == true)
		{
			System.out.println("Array is in Descending Order");
		}
		else
		{
			System.out.println("Array is in Ascending Order");				
		}
		
		
		double avg = self.findAverage(numbers, value);
		System.out.printf("Average  is  %f", avg);
		
	}

	
	
	
	
	public boolean isSorted(int[] numbers)
	{
		
		for(int index=0; index < numbers.length-1; index++)
		{
			if(numbers[index] > numbers[index+1])
			{
				return false;
			}
		}
				
		return true;
		
	}
	
	
	
	
	
	public double findAverage(int[] numbers)
	{
		int sum = 0;
		double avg = 0;
		
		for(int index = 0; index<numbers.length-1; index++)
		{
			sum = sum + numbers[index];
		}
		
		avg = (double)sum / value ;

		return avg;
		
	}
	
	
}
