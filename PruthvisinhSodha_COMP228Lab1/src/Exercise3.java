import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Weight in pounds:");
		double pounds = input.nextDouble();
		double weight;
		weight = pounds * 0.453;
		

		System.out.println("Enter Height in feet:");
		double feet = input.nextDouble();
		double height;
		height = feet * 0.304;
		
		double bmi;
		bmi = weight / Math.pow(height, 2);
		System.out.printf("Body Mass Index value  is  %f", bmi);
		
		
		Exercise3 self = new Exercise3();

		String interpretation = self.printBmiDescription(bmi);
		System.out.printf("\nBMI Interpretation  is  %s !", interpretation);
		
	}
	
	
	public String printBmiDescription(double bmi)
	{
		String i;
		
		if (bmi < 18.5)
		{
			i ="Underweight";
		}
		else if (bmi > 18.5 && bmi < 24.9)
		{
			i = "Normal";
		}
		else if (bmi > 25 && bmi < 29.9)
		{
			i = "Overweight";
		}
		else
		{
			i = "Obese";
		}
		return i;	
	}
	

}
