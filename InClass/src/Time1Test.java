
public class Time1Test {

	public static void main(String[] args) {

		//Declaration & initialization
		TimeApplication timeObj = new TimeApplication();
		TimeApplication time2Obj;

		try {
			//set values for the object
			timeObj.setTime(25, 30, 55);

			//print time in Universal Format
			System.out.println("Time Universal Format" + timeObj.toUniversalString());

			//print the object using toString method
			System.out.println("Time:" + timeObj.toString());
		
			//initialize time2Obj
			time2Obj = new TimeApplication(3, 15, 0);
		
		}
		catch(IllegalArgumentException e)
		{
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}
		catch(Exception e)
		{
			System.out.printf("Something went wrong! The application will end");
			System.exit(1); //end the application
		}

	}

}
