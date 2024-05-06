
public class Coffee extends Beverage{
	
	private final double PRICE_EXTRA_SHOT = 0.5;
	private final double PRICE_EXTRA_SYRUP = 0.5;
	
	private boolean extraShot;
	private boolean extraSyrup;
	
	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		super(bevName, Type.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}
	
	public boolean getExtraShot()
	{
		return this.extraShot;
	}
	
	public boolean getExtraSyrup()
	{
		return this.extraSyrup;
	}
	
	public double calcPrice()
	{
		double price = super.addSizePrice();
		if (extraShot)
		{
			price += PRICE_EXTRA_SHOT;
		}
		if (extraSyrup)
		{
			price += PRICE_EXTRA_SYRUP;
		}
		return price;
	}
	
	public String toString()
	{
		return super.toString()  + "," + Type.COFFEE + "," + this.extraShot + "," + this.extraSyrup + "," + calcPrice();
	}
	
	public boolean equals(Coffee anotherBev)
	{
		if (super.equals(anotherBev))
		{
			if (this.extraShot == anotherBev.getExtraShot() && this.extraSyrup == anotherBev.getExtraSyrup() && calcPrice() == anotherBev.calcPrice())
			{
				return true;
			}
		}
		return false;
	}
}
