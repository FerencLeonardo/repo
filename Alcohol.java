
public class Alcohol extends Beverage{
	
	private final double PRICE_WEEKEND = 0.6;
	
	private boolean isWeekend;
	
	public Alcohol(String bevName, Size size, boolean isWeekend)
	{
		super(bevName, Type.ALCOHOL, size);
		this.isWeekend = isWeekend;
	}
	
	public boolean isWeekend()
	{
		return this.isWeekend;
	}
	
	public double calcPrice()
	{
		double price = super.addSizePrice();
		if (isWeekend)
		{
			price += PRICE_WEEKEND;
		}
		return price;
	}
	
	public String toString()
	{
		return super.toString()  + "," + Type.ALCOHOL + "," + this.isWeekend + "," + calcPrice();
	}
	
	public boolean equals(Alcohol anotherBev)
	{
		if (super.equals(anotherBev))
		{
			if (this.isWeekend == anotherBev.isWeekend() && calcPrice() == anotherBev.calcPrice())
			{
				return true;
			}
		}
		return false;
	}
}

