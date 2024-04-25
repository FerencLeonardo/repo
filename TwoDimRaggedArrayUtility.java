import java.io.*;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	public TwoDimRaggedArrayUtility()
	{
		
	}
	
	public static double[][] readFile(File file) throws FileNotFoundException
	{
		final int MAX_ROW = 10;
		final int MAX_COLUMN = 10;
		
		Scanner inputFile = new Scanner(file);
		
		String[][] tempArray = new String[MAX_ROW][MAX_COLUMN];
		
		for (int row = 0; row < MAX_ROW; row++)
		{
			if (inputFile.hasNextLine() == true)
			{
				String line = inputFile.nextLine();
				
				String[] lineArray = line.split(" ");
				for (int col = 0; col < lineArray.length; col++)
				{
					tempArray[row][col] = lineArray[col];
				}
			}
		}
		
		int numRows = 0;
		
		for (int i = 0; i < MAX_ROW; i++)
		{
			if (tempArray[i][0] != null)
			{
				numRows++;
			}
		}
		
		double[][] data = new double[numRows][];
		
		for (int r = 0; r < data.length; r++)
		{
			int numCols = 0;
			for (int c = 0; c < MAX_COLUMN; c++)
			{
				if (tempArray[r][c] != null)
				{
					numCols++;
				}
			}
			data[r] = new double[numCols];
		}
		
		for (int r = 0; r < data.length; r++)
		{
			for (int c = 0; c < data[r].length; c++)
			{
				data[r][c] = Double.parseDouble(tempArray[r][c]);
			}
		}
		
		inputFile.close();
		
		return data;
	}
	
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException
	{
		PrintWriter file = new PrintWriter(outputFile);
		
		for (int row = 0; row < data.length; row++)
		{
			for (int col = 0; col < data[row].length; col++)
			{
				file.print(data[row][col] + " ");
			}
			file.println("");
		}
		
		file.close();
	}
	
	public static double getTotal(double[][] data)
	{
		double total = 0;
		
		for (int r = 0; r < data.length; r++)
		{
			for (int c = 0; c < data[r].length; c++)
			{
				total += data[r][c]; 
			}
		}
		
		return total;
	}
	
	public static double getRowTotal(double[][] data, int row)
	{
		double total = 0;

		for (int c = 0; c < data[row].length; c++)
		{
			total += data[row][c]; 
		}
		
		return total;
	}
	
	public static int getLowestInRowIndex(double[][] data, int row)
	{
		int index = 0;
		double lowest = data[row][0];

		for (int c = 0; c < data[row].length; c++)
		{
			if (data[row][c] < lowest)
			{
				index = c;
				lowest = data[row][c];
			}
		}
		
		return index;
	}

	public static double getLowestInRow(double[][] data, int row)
	{
		double lowest = data[row][0];

		for (int c = 0; c < data[row].length; c++)
		{
			if (data[row][c] < lowest)
			{
				lowest = data[row][c];
			}
		}
		
		return lowest;
	}
	
	public static int getLowestInColumnIndex(double[][] data, int col)
	{
		int index = 0;
		double lowest = Double.MAX_VALUE;

		for (int r = 0; r < data.length; r++)
		{
			if (data[r].length > col)
			{
				if (data[r][col] < lowest)
				{
					index = r;
					lowest = data[r][col];
				}
			}
		}
		
		return index;
	}
	
	public static double getLowestInColumn(double[][] data, int col)
	{
		double lowest = Double.MAX_VALUE;

		for (int r = 0; r < data.length; r++)
		{
			if (data[r].length > col)
			{
				if (data[r][col] < lowest)
				{
					lowest = data[r][col];
				}
			}
		}
		
		return lowest;
	}

	public static double getLowestInArray(double[][] data)
	{
		double lowest = Double.MAX_VALUE;
		
		for (int r = 0; r < data.length; r++)
		{
			for (int c = 0; c < data[r].length; c++)
			{
				if (data[r][c] < lowest)
				{
					lowest = data[r][c];
				}
			}
		}
		
		return lowest;
	}
	
	public static int getHighestInRowIndex(double[][] data, int row)
	{
		int index = 0;
		double highest = data[row][0];

		for (int c = 0; c < data[row].length; c++)
		{
			if (data[row][c] > highest)
			{
				index = c;
				highest = data[row][c];
			}
		}
		
		return index;
	}
	
	public static double getHighestInRow(double[][] data, int row)
	{
		double highest = data[row][0];

		for (int c = 0; c < data[row].length; c++)
		{
			if (data[row][c] > highest)
			{
				highest = data[row][c];
			}
		}
		
		return highest;
	}
	
	public static int getHighestInColumnIndex(double[][] data, int col)
	{
		int index = 0;
		double highest = 0;

		for (int r = 0; r < data.length; r++)
		{
			if (data[r].length > col)
			{
				if (data[r][col] > highest)
				{
					index = r;
					highest = data[r][col];
				}
			}
		}
		
		return index;
	}
	
	public static double getHighestInColumn(double[][] data, int col)
	{
		double highest = 0;

		for (int r = 0; r < data.length; r++)
		{
			if (data[r].length > col)
			{
				if (data[r][col] > highest)
				{
					highest = data[r][col];
				}
			}
		}
		
		return highest;
	}
	
	public static double getHighestInArray(double[][] data)
	{
		double highest = 0;
		
		for (int r = 0; r < data.length; r++)
		{
			for (int c = 0; c < data[r].length; c++)
			{
				if (data[r][c] > highest)
				{
					highest = data[r][c];
				}
			}
		}
		
		return highest;
	}
	
	public static double getColumnTotal(double[][] data, int col)
	{
		double total = 0;

		for (int r = 0; r < data.length; r++)
		{
			if (data[r].length > col)
			{
				total += data[r][col];
			}
		}
		
		return total;
	}
	
	public static double getAverage(double[][] data)
	{
		double avg = 0;
		int elements = 0;
		
		for (int r = 0; r < data.length; r++)
		{
			for (int c = 0; c < data[r].length; c++)
			{
				avg += data[r][c]; 
				elements++;
			}
		}
		
		return avg / elements;
	}
}