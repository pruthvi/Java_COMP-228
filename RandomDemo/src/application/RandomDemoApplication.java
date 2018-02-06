package application;

import java.util.Random; //used to generate random values

public class RandomDemoApplication {
	public static void main(String[] args)
	{
		//Declaration & Initialization
		RandomDemoApplication self = new RandomDemoApplication();
		
		//repeat for each irand 0...9
		for(int iRand=0; iRand<10; iRand++)
		{
			System.out.println((iRand+1)+"-"+self.generateRandomValue());
		}
		
	}
	
	public int generateRandomValue()
	{
		//Declaration & initialization
		Random rnd = new Random();
		int rndValue; //represents the random value
		
		rnd.setSeed(5); //generate same random value
		
		//generate a random value between 1 and 10
		rndValue = rnd.nextInt(10)+1;
		
		return rndValue;
		
	}
}
