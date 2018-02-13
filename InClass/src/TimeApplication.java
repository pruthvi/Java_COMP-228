//package application;

public class TimeApplication {

	private int _hour;
	private int _minute;
	private int _seconds;
	
	public TimeApplication()
	{
		this(24, 0, 0);
	}

	//add non default constructor
	public TimeApplication(int newHour, int newMinute, int newSeconds)
	{
		this.setTime(newHour, newMinute, newSeconds);		
	}

	// set a new time value using universal time; throw an
	// exception if the hour, minute or second is invalid
	public void setTime(int newHour, int newMinute, int newSecond)
	{
		// validate hour, minute and second
		if(newHour < 0 || newHour >= 24 || newMinute < 0 || newMinute >= 60 ||
				newSecond < 0 || newSecond >= 60)
		{
			throw new IllegalArgumentException(
					"hour, minute and/or second was out of range");
		}
		else { //otherwise if all the values are valid
			this._hour = newHour;
			this._minute = newMinute;
			this._seconds = newSecond;
		}

	}

	// convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString()
	{
		return String.format("%02d:%02d:%02d",
				this._hour, this._minute, this._seconds);
	}

	// convert to String in standard-time format (H:MM:SS AM or PM)
	@Override
	public String toString()
	{
		return String.format("%d:%02d:%02d %s", ((this._hour == 0 || this._hour == 12) ? 12 : this._hour % 12),
				this._minute, this._seconds, (this._hour < 12 ? "AM" : "PM"));
	}
}
