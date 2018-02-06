package application;
public class Arrays101 {

	public static void main(String[] args)
	{
		//Declaration &Initializations
		int[] box = new int[5];
		box[0]=100;
		box[1]=-50;
		box[2]=36;
		box[3]=78;
		box[4]=65;
		
		//repeat for index0...(box.length -1)
		for(int index=0; index < box.length; index++)
		{
			System.out.println("["+index+"]="+box[index]);
		}
		
		
		System.out.println("\n\n****print in reverse order***");
		
		//print the elements in reverse order
		for(int index=(box.length-1); index >=0; index--)
		{
			System.out.println("["+index+"]="+box[index]);
		}
		
		
	}
}
