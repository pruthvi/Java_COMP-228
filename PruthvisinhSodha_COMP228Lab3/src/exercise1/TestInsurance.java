package exercise1;

import java.util.Scanner;

public class TestInsurance {

	public static void main(String[] args) {
		
		Scanner inputType = new Scanner(System.in);
		System.out.println("Select Insurance Type. Enter 1 for Life Insurance and Enter 2 for Health Insurance");
		int type = inputType.nextInt();
		

		if(type == 1)
		{
			Life lifeInsurance = new Life();
			lifeInsurance.displayInfo();
		}
		else if(type == 1)
		{
			Health healthInsurance = new Health();
			healthInsurance.displayInfo();
		}
		else 
		{
			System.out.println("Invaild Input");

		}

	}

}
