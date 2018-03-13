package application;

public class ScienceBook extends Book{


	//Constructor
	public ScienceBook (String newTitle, String newISBN, String newPublisher, double newPrice, int newYear)
	{
		super(newTitle,  newISBN, newPublisher, newPrice,  newYear);
				
	}
	

	@Override
	public double setPrice(double price)
	{
		double discount;
		discount = price * 10 / 100;
		price = price - discount;
		return price;
	}
	
	@Override
	public  String getGenre()
	{
		String genre = "Science";
		return genre;
	}; 
	
	
	@Override
	public String toString()
	{
		return super.toString() + ", " + getGenre();
	}

}
