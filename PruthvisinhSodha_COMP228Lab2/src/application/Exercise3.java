package application;


public class Exercise3 {

	public static void main(String[] args) {

		//creating object of main method
		MultipleOverloading display = new MultipleOverloading();

		//displaying the results with methods overloaded 
		display.sum(5,10);
		display.sum(5,10,3.14);
		display.sum(5,10,3.14,"\t hello");
	}

}

class MultipleOverloading {

	//creating first method to overload with 2 integer parameters
	public void sum(int x, int y)
	{
		System.out.printf("sum of two integers is:\t ");
		System.out.println(x + y);
	}
	
	//creating 2 method having 2 integers and one double parameter
		public void sum(int x, int y, double z)
	{
		System.out.printf("sum of three integers is:\t ");
		System.out.println(x + y + z);
	}

	//similarly creating other methods to overload
	public void sum(int x, int y, double z, String c)
	{
		System.out.printf("sum of four integers is:\t ");
		System.out.println(x + y + z + c);
	}

}


