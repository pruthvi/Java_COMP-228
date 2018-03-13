package application;

public class ChildrenBook extends Book{
	
	
	//Constructor
	public ChildrenBook (String newTitle, String newISBN, String newPublisher, double newPrice, int newYear)
	{
		super(newTitle,  newISBN, newPublisher, newPrice,  newYear);
				
	}
	
	
	@Override
	public double setPrice(double price)
	{
		price = 35.00;
		return price;
	}
	
	@Override
	public  String getGenre()
	{
		String genre = "Children";
		return genre;
	}; 
	
	@Override
	public String toString()
	{
		return super.toString() + ", " + getGenre();
	}
}
