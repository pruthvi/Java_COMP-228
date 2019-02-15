package exercise2;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {

		Scanner inputStatus = new Scanner(System.in);
		System.out.println("Select Game Testing Type. Enter 0 for Part Time and Enter 1 for Full Time");
		Boolean status = inputStatus.hasNext();
		
		Scanner inputTester = new Scanner(System.in);
		System.out.println("Enter Tester Name:");
		String  tester = inputTester.next();
		
		Scanner inputSalary = new Scanner(System.in);
		System.out.println("Enter Salary or Hours:");
		int  salary = inputSalary.nextInt();
		

		if(status)
		{
			PartTimeGameTester newPT = new PartTimeGameTester(tester, status, salary);
			newPT.setSalary(salary);
			System.out.println("Tester Details:" + newPT.toString());

		}
		else if (!status)
		{
			FullTimeGameTester newFT = new FullTimeGameTester(tester, status, salary);
			newFT.setSalary(salary);
			System.out.println("Tester Details:" + newFT.toString());
		} else
		{
			System.out.printf("Incorrect Status");
		}
	}

}
