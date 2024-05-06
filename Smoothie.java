
public class Smoothie extends Beverage{
	
	private final double PRICE_FRUIT = 0.5;
	private final double PRICE_PROTEIN = 1.5;
	
	private int numOfFruits;
	private boolean addProtein;
	
	public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein)
	{
		super(bevName, Type.SMOOTHIE, size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
	}
	
	public int getNumOfFruits()
	{
		return this.numOfFruits;
	}
	
	public boolean getAddProtein()
	{
		return this.addProtein;
	}
	
	public double calcPrice()
	{
		double price = super.addSizePrice();
		for (int i = 0; i < numOfFruits; i++)
		{
			price += PRICE_FRUIT;
		}
		if (addProtein)
		{
			price += PRICE_PROTEIN;
		}
		return price;
	}
	
	public String toString()
	{
		return super.toString()  + "," + Type.SMOOTHIE + "," + this.addProtein + "," + this.numOfFruits + "," + calcPrice();
	}
	
	public boolean equals(Smoothie anotherBev)
	{
		if (super.equals(anotherBev))
		{
			if (this.addProtein == anotherBev.getAddProtein() && this.numOfFruits == anotherBev.getNumOfFruits() && calcPrice() == anotherBev.calcPrice())
			{
				return true;
			}
		}
		return false;
	}
}
