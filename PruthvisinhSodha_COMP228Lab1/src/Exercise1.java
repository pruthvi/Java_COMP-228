// Body Mass Index (BMI), a measure of health on weight, is calculated by taking your weight in
// kilograms and dividing by the square of your height in meters.
// Develop an application that prompts the user to enter a weight in pounds and height in feet and
// display the BMI value.
// 1 pound is 0.453 kilograms
// 1 foot is 0.304 meters


import java.util.Scanner;

public class Exercise1 {
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
		
	}
}
