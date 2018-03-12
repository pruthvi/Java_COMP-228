package application;

public class Circle extends Shape {

	//Fields
	protected double _radius;
	
	//Methods
	
	public Circle(String newName, String newColor, double newRad )
	{
		//shape class
		super(newName, newColor);

		this._radius = newRad;
	}
	
	//Accessor and Mutator
	
	
	
	public void setRadius(double newRad)
	{
		this._radius = newRad;
	}
	public double getRadius()
	{
		return this._radius;
	}
	
	
	public double calcArea()
	{
		return Math.pow(this._radius, 2)*Math.PI;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + ", " + this._radius;
	}
	
	
	
}
