
public class HolidayBonus {
	final static double HIGHEST_BONUS = 5000;
	final static double LOWEST_BONUS = 1000;
	final static double BONUS = 2000;
	
	public HolidayBonus()
	{
		
	}
	
	public static double[] calculateHolidayBonus(double[][] data)
	{
		int columns = 0;
		
		for (int row = 0; row < data.length; row++)
		{
			if (data[row].length > columns)
			{
				columns = data[row].length;
			}
		}
		
		double[] bonusArray = new double[data.length];
		
		for (int col = 0; col < columns; col++)
		{
			double highest = TwoDimRaggedArrayUtility.getHighestInColumn(data, col);
			double lowest = TwoDimRaggedArrayUtility.getLowestInColumn(data, col);
			
			for (int row = 0; row < data.length; row++)
			{
				if (data[row].length > col)
				{
					if (data[row][col] > 0)
					{
						if (data[row][col] == highest)
						{
							bonusArray[row] += HIGHEST_BONUS;
						}
						else if (data[row][col] == lowest && data[row][col] != highest)
						{
							bonusArray[row] += LOWEST_BONUS;
						}
						else
						{
							bonusArray[row] += BONUS;
						}
					}
				}
			}
		}
		
		return bonusArray;
	}
	
	public static double calculateTotalHolidayBonus(double[][] data)
	{
		double total = 0;
		double[] bonusArray = calculateHolidayBonus(data);
		for (int index = 0; index < bonusArray.length; index++)
		{
			total += bonusArray[index];
		}
		return total;
	}
}
