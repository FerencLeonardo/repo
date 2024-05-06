
public abstract class Beverage {
	
	private final double BASE_PRICE = 2.0;
	private final double SIZE_PRICE = 0.5;
	
	private String bevName;
	private Type type;
	private Size size;
	
	public Beverage(String bevName, Type type, Size size)
	{
		this.bevName = bevName;
		this.type = type;
		this.size = size;
	}
	
	public double addSizePrice()
	{
		switch (size)
		{
			case SMALL:
				return this.BASE_PRICE;
			case MEDIUM:
				return this.BASE_PRICE + this.SIZE_PRICE;
			case LARGE:
				return this.BASE_PRICE + (this.SIZE_PRICE * 2);
			default:
				return 0;
		}
		
	}
	
	public double getBasePrice()
	{
		return this.BASE_PRICE;
	}
	
	public Type getType()
	{
		return this.type;
	}
	
	public String getBevName()
	{
		return this.bevName;
	}
	
	public Size getSize()
	{
		return this.size;
	}
	
	public String toString()
	{
		return this.bevName + "," + this.size;
	}
	
	public boolean equals(Beverage anotherBev)
	{
		if (bevName == anotherBev.getBevName() && type == anotherBev.getType() && size == anotherBev.getSize())
		{
			return true;
		}
		return false;
	}
	
	public abstract double calcPrice();
}
