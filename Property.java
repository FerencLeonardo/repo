/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: A management company interactive system with GUI.
 * Due: 04/10/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Ferenc Leonardo Livak
*/

public class Property {

	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;
	
	public Property()
	{
		this.propertyName = "";
		this.city = "";
		this.owner = "";
		this.plot = new Plot();
	}
	public Property(String propertyName, String city, double rentAmount, String owner)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot();
	}
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}
	public Property(Property otherProperty)
	{
		this.propertyName = otherProperty.getPropertyName();
		this.city = otherProperty.getCity();
		this.rentAmount = otherProperty.getRentAmount();
		this.owner = otherProperty.getOwner();
		this.plot = otherProperty.getPlot();
	}
	
	public void setPropertyName(String propertyName)
	{
		this.propertyName = propertyName;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public void setRentAmount(double rentAmount)
	{
		this.rentAmount = rentAmount;
	}
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	public void setPlot(Plot plot)
	{
		this.plot = new Plot(plot);
	}
	
	public String getPropertyName()
	{
		return this.propertyName;
	}
	public String getCity()
	{
		return this.city;
	}
	public double getRentAmount()
	{
		return this.rentAmount;
	}
	public String getOwner()
	{
		return this.owner;
	}
	public Plot getPlot()
	{
		return new Plot(this.plot);
	}
	
	public String toString()
	{
		return propertyName + "," + city + "," + owner + "," + rentAmount;
	}
}
