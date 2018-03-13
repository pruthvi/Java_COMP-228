package application;

public abstract class Book {

	protected String  title;
	protected String  isbn;
	protected String  publisher;
	protected double  price;
	protected int  year;


	//Constructor
	public Book (String newTitle, String newISBN, String newPublisher, double newPrice, int newYear)
	{
		this.title = newTitle;
		this.isbn = newISBN;
		this.publisher = newPublisher;
		this.price = newPrice;
		this.year = newYear;			
	}

	//toString method

	@Override
	public String toString()
	{
		return (this.title + ", " + this.isbn + ", " + this.publisher + ", " + this.price + ", " + this.year);
	}


	//Getter and Setter
	//Title
	public void setTitle(String newTitle)
	{
		this.title = newTitle;
	}
	public String getTitle()
	{
		return title;
	}
	
	//ISBN
	public void setISBN(String newISBN)
	{
		this.isbn = newISBN;
	}
	public String getISBN()
	{
		return isbn;
	}
	
	//Publisher
	public void setPublisher(String newPublisher)
	{
		this.publisher = newPublisher;
	}
	public String getPublisher()
	{
		return publisher;
	}
	
	//Year
	public void setYear(int newYear)
	{
		this.year = newYear;
	}
	public int getYear()
	{
		return year;
	}

	// abstract method for price
	public abstract double setPrice(double price);
	
	// abstract method for genre
	public abstract String getGenre(); 

}
