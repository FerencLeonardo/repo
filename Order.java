
import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order>{
	
	private int orderNum;
	private int orderTime;
	private Day orderDay;
	private Customer cust;
	private ArrayList<Beverage> beverages = new ArrayList<Beverage>();

	public Order(int orderTime, Day orderDay, Customer cust)
	{
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.cust = new Customer(cust);
		this.orderNum = generateOrder();
	}

	public int generateOrder()
	{
		Random rand = new Random();
		return rand.nextInt(10000, 90000);
	}
	
	public double calcOrderTotal()
	{
		double totalPrice = 0;
		for (int i = 0; i < getTotalItems(); i++)
		{
			totalPrice += getBeverage(i).calcPrice();
		}
		return totalPrice;
	}
	
	public int findNumOfBeveType(Type type)
	{
		int counter = 0;
		for (int i = 0; i < getTotalItems(); i++)
		{
			if (getBeverage(i).getType() == type)
			{
				counter++;
			}
			
		}
		return counter;
	}
	
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		beverages.add(new Coffee(bevName, size, extraShot, extraSyrup));
	}
	
	public void addNewBeverage(String bevName, Size size)
	{
		beverages.add(new Alcohol(bevName, size, isWeekend()));
	}
	
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein)
	{
		beverages.add(new Smoothie(bevName, size, numOfFruits, addProtein));
	}
	
	public Beverage getBeverage(int itemNo)
	{
		if (getTotalItems() == 0)
		{
			return null;
		}
		return beverages.get(itemNo);
	}
	
	public int getTotalItems()
	{
		return beverages.size();
	}
	
	public int getOrderNo()
	{
		return this.orderNum;
	}
	
	public int getOrderTime()
	{
		return this.orderTime;
	}
	
	public Day getOrderDay()
	{
		return this.orderDay;
	}
	
	public Customer getCustomer()
	{
		return new Customer(this.cust);
	}
	
	public Day getDay()
	{
		return this.orderDay;
	}
	
	public boolean isWeekend()
	{
		if (getOrderDay() == Day.SATURDAY || getOrderDay() == Day.SUNDAY)
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		return this.orderNum + "," + this.orderTime + "," + this.orderDay + "," + this.cust.getName() + "," + this.cust.getAge() + "," + beverages;
	}
	
	public int compareTo(Order anotherOrder)
	{
		if (this.orderNum == anotherOrder.getOrderNo())
		{
			return 0;
		}
		else if (this.orderNum > anotherOrder.getOrderNo())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
