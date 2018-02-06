package application;

import java.util.Arrays;

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
		
		Arrays101 self = new Arrays101();
		
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
		
		System.out.println("\n\n****print array***");
		self.printElements(box);
		
		System.out.println("\n\n****print in reverse order***");
		self.printReverse(box);
		
		System.out.println("\n\n****print ARRAY AS STRING***");
		
		System.out.println("Elements of the Array:"+Arrays.toString(box));
	}
	
	public void printElements(int[] box)
	{
		for(int index=0; index < box.length; index++)
		{
			System.out.println("["+index+"]="+box[index]);
		}
	}
	
	public void printReverse(int[] box)
	{
		for(int index=(box.length-1); index >=0; index--)
		{
			System.out.println("["+index+"]="+box[index]);
		}
		
	}
	
	public String convertToString(int[] box)
	{
		return Arrays.toString(box);
	}
	
	public void initializaArray()
	{
		
	}
	
}
