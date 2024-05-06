
import java.util.*;

public class BevShopDriverApp {
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		BevShop bevshop = new BevShop();
		
		System.out.println("The current order in process can have at most " + bevshop.getMaxOrderForAlcohol() + " alcoholic beverages.");
		System.out.println("The minimum age to order alcohol drink is " + bevshop.getMinAgeForAlcohol());
		System.out.println("Start please a new order: ");
		System.out.println("Your Total Order for now is 0.0");
		System.out.println("Would you please enter your name: ");
		String name = keyboard.nextLine();
		System.out.println("Would you please enter your age: ");
		int age = keyboard.nextInt();
		bevshop.startNewOrder(20, Day.SATURDAY, name, age);
		if (age < bevshop.getMinAgeForAlcohol())
		{
			System.out.println("Your age is under 21 and you are not eligible to order alcohol");
		}
		else
		{
			System.out.println("Your age is above 21 and you are eligible to order alcohol");
		}
		
		System.out.println("Would you please add an alcohol drink");
		bevshop.processAlcoholOrder("moscow mule", Size.LARGE);
		System.out.println("The current order of drinks is " + bevshop.getCurrentOrder().getTotalItems());
		System.out.println("The Total price on the Order is " + bevshop.getCurrentOrder().calcOrderTotal());
		if (bevshop.isEligibleForMore())
		{
			System.out.println("Your current alcohol drink order is less than " + bevshop.MAX_ORDER_FOR_ALCOHOL);
		}
		
		System.out.println("Would you please add a second alcohol drink");
		bevshop.processAlcoholOrder("beer", Size.SMALL);
		System.out.println("The current order of drinks is " + bevshop.getCurrentOrder().getTotalItems());
		System.out.println("The Total price on the Order is " + bevshop.getCurrentOrder().calcOrderTotal());
		if (bevshop.isEligibleForMore())
		{
			System.out.println("Your current alcohol drink order is less than " + bevshop.MAX_ORDER_FOR_ALCOHOL);
		}
		System.out.println("Would you please add a third alcohol drink");
		bevshop.processAlcoholOrder("vodka shot", Size.MEDIUM);
		System.out.println("The current order of drinks is " + bevshop.getCurrentOrder().getTotalItems());
		System.out.println("The Total price on the Order is " + bevshop.getCurrentOrder().calcOrderTotal());
		if (bevshop.isEligibleForMore())
		{
			System.out.println("Your current alcohol drink order is less than " + bevshop.MAX_ORDER_FOR_ALCOHOL);
		}
		
		System.out.println("You have a maximum alcohol drinks for this order");
		System.out.println("Would you please add a " + Type.COFFEE + " to your order");
		bevshop.processCoffeeOrder("caramel machiato", Size.MEDIUM, true, true);
		System.out.println("The current order of drinks is " + bevshop.getCurrentOrder().getTotalItems());
		System.out.println("The Total price on the Order is " + bevshop.getCurrentOrder().calcOrderTotal());
		
		name = keyboard.nextLine();
		
		System.out.println("Would you please start a new order");
		System.out.println("Would you please enter your name: ");
		name = keyboard.nextLine();
		System.out.println("Would you please enter your age: ");
		age = keyboard.nextInt();
		bevshop.startNewOrder(10, Day.MONDAY, name, age);
		System.out.println("The Total Price on the Order: 0.0");
		System.out.println("Would you please add a " + Type.SMOOTHIE + " to your order");
		bevshop.processSmoothieOrder("mango blend", Size.MEDIUM, 4, true);
		System.out.println("The Total price on the Order is " + bevshop.getCurrentOrder().calcOrderTotal());
		System.out.println("Would you please add a " + Type.COFFEE + " to your order");
		System.out.println("Would you please add a " + Type.SMOOTHIE + " to your order");
		System.out.println("The Total price on the Order is " + bevshop.getCurrentOrder().calcOrderTotal());
		System.out.println("Would you please add a drink");
		System.out.println("Your Age is not appropriate for alcohol drink!!");
		System.out.println("The current order of drinks is " + bevshop.getCurrentOrder().getTotalItems());
		System.out.println("The Total price on the Order is " + bevshop.getCurrentOrder().calcOrderTotal());
		System.out.println("The total number of fruits is " + bevshop.getMaxNumOfFruits());
		if (bevshop.isMaxFruit(6))
		{
			System.out.println("You reached a Maximum number of fruits");
		}
		
		System.out.println("Total price on the second order: " + bevshop.getOrderAtIndex(1).calcOrderTotal());
		System.out.println("Total amount for all Orders: " + bevshop.totalMonthlySale());

		System.out.println(bevshop);
		
		keyboard.close();
	}
}
