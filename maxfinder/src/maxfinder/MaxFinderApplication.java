package maxfinder;

public class MaxFinderApplication {

	public static void main(String[] args) {

		System.out.println("The biggest value (78,5,25): "+ max(78,5,25));
		System.out.println("The biggest value (55,-1): "+ findMax(55,-1));
		System.out.println("The biggest value (1.23,0.5): "+ findMax(1.23,0.5));
	}

	
	//returns the biggest between two integers	
	public static int findMax(int num1, int num2)
	{
		return(num1>num2)? num1:num2;
		
	}

	//returns the biggest between two doubles

	public static double findMax(double num1, double num2)
	{
		return(num1>num2)? num1:num2;
		
	}
	
	//returns the biggest between three integers
	public static int max (int num1, int num2, int num3)
	{
		return findMax(findMax(num1,num2),num3);
		//return Math.max(Math.max(num1, num2), num3);
	}
	
	
	
}
