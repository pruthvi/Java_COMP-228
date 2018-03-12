package application;

public class Cylinder extends Circle{

	//Fields

	private double _height;

	
	//Methods
	public Cylinder(String newName, String newColor, double newRad, double newHeight)
	{
		//shape class
		super(newName, newColor, newRad);

		this._height = newHeight;
	}
	
	//Accessors and Mutators


	public void setHeight(double newHeight)
	{
		this._height = newHeight;
	}
	public double getHeight()
	{
		return this._height;
	}
	
	@Override
	public double calcArea()
	{
		return (2 * Math.PI * this._radius * this._height ) +
				(2 * super.calcArea());
	}
	
	@Override
	public String toString()
	{
		return super.toString() + ", " + this._height;
	}
	
	

}
