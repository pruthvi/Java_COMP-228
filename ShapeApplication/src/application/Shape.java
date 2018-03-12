package application;

public abstract class Shape {

	//Fields
	protected String _name;
	protected String _color;


	//Methods
	public Shape (String newName, String newColor)
	{
		this._name = newName;
		this._color = newColor;
	}
	
	
		//accessor and mutator
		public void setName(String newName)
		{
			this._name = newName;
		}
		public String getName()
		{
			return _name;
		}
		
		public void setColor(String newColor)
		{
			this._color = newColor;
		}
		public String getColor()
		{
			return _color;
		}
	
	
	@Override
	public String toString()
	{
		return (this._name + ", " + this._color);
	}

}
