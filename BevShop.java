import java.util.ArrayList;

public class BevShop implements BevShopInterface{
	
	private int numOfAlcohol;
	
	public ArrayList<Order> orders = new ArrayList<Order>();
	
	public BevShop()
	{
		
	}
	
	public boolean isValidTime(int time)
	{
		if (time >= MIN_TIME && time <= MAX_TIME)
		{
			return true;
		}
		return false;
	}
	
	public int getMaxNumOfFruits()
	{
		return MAX_FRUIT;
	}
	
	public int getMinAgeForAlcohol()
	{
		return MIN_AGE_FOR_ALCOHOL;
	}
	
	public int getMaxOrderForAlcohol()
	{
		return MAX_ORDER_FOR_ALCOHOL;
	}
	
	public boolean isEligibleForMore()
	{
		if (numOfAlcohol > getMaxOrderForAlcohol())
		{
			return false;
		}
		return true;
	}
	
	public boolean isMaxFruit(int numOfFruits)
	{
		if (numOfFruits > getMaxNumOfFruits())
		{
			return true;
		}
		return false;
	}
	
	public int getNumOfAlcoholDrink()
	{
		return this.numOfAlcohol;
	}
	
	public boolean isValidAge(int age)
	{
		if (age >= getMinAgeForAlcohol())
		{
			return true;
		}
		return false;
	}
	
	public void startNewOrder(int time, Day day, String customerName, int customerAge)
	{
		if (isValidTime(time))
		{
			orders.add(new Order(time, day, new Customer(customerName, customerAge)));
			this.numOfAlcohol = 0;
		}
	}
	
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		getCurrentOrder().addNewBeverage(bevName, size, extraShot, extraSyrup);
	}
	
	public void processAlcoholOrder(String bevName, Size size)
	{
		if (isEligibleForMore() && isValidAge(getCurrentOrder().getCustomer().getAge()))
		{
			getCurrentOrder().addNewBeverage(bevName, size);
			numOfAlcohol++;
		}
		
	}
	
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein)
	{
		if (!(isMaxFruit(numOfFruits)))
		{
			getCurrentOrder().addNewBeverage(bevName, size, numOfFruits, addProtein);
		}
	}
	
	public int findOrder(int orderNo)
	{
		for (int i = 0; i < orders.size(); i++)
		{
			if (orders.get(i).getOrderNo() == orderNo)
			{
				return i;
			}
		}
		return -1;
	}
	
	public Order getCurrentOrder()
	{
		if (orders.size() == 0)
		{
			return null;
		}
		return orders.get(orders.size() - 1);
	}
	
	public Order getOrderAtIndex(int index)
	{
		return orders.get(index);
	}
	
	public void sortOrders()
	{
		for (int i = 0; i < orders.size() - 1; i++)
		{
			int lowestOrderNum = orders.get(i).getOrderNo();
			for (int j = i + 1; j < orders.size(); j++)
			{
				if (orders.get(j).getOrderNo() < lowestOrderNum)
				{
					lowestOrderNum = orders.get(j).getOrderNo();
				}
			}
			
			Order temp = getOrderAtIndex(findOrder(orders.get(i).getOrderNo()));
			int tempIndex = findOrder(lowestOrderNum);
			orders.set(i, getOrderAtIndex(findOrder(lowestOrderNum)));
			orders.set(tempIndex, temp);
		}
	}
	
	public String toString()
	{
		return orders + "," + totalMonthlySale();
	}

	public double totalOrderPrice(int orderNo) 
	{
		return orders.get(findOrder(orderNo)).calcOrderTotal();
	}

	public double totalMonthlySale() 
	{
		double totalSale = 0;
		for (int i = 0; i < orders.size(); i++)
		{
			totalSale += totalOrderPrice(orders.get(i).getOrderNo());
		}
		return totalSale;
	}

	public int totalNumOfMonthlyOrders() 
	{
		return orders.size();
	}
}
