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

public class Plot {
	
	private int x;
	private int y;
	private int width;
	private int depth;
	
	public Plot()
	{
		this.width = 1;
		this.depth = 1;
	}
	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	public Plot(Plot plot)
	{
		this.x = plot.getX();
		this.y = plot.getY();
		this.width = plot.getWidth();
		this.depth = plot.getDepth();
	}
	
	public boolean overlaps(Plot plot)
	{
		for (int x = plot.getX(); x < plot.getX() + plot.getWidth(); x++)
		{
			for (int y = plot.getY(); y < plot.getY() + plot.getDepth(); y++)
			{
				if ((x >= this.x && x < this.x + this.width) && (y >= this.y && y < this.y + this.depth))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean encompasses(Plot plot)
	{
		if ((plot.getX() >= this.x && (plot.getX() + plot.getWidth()) <= (this.x + width)) && (plot.getY() >= this.y && (plot.getY() + plot.getDepth()) <= (this.y + depth)))
		{
			return true;
		}
		return false;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
	public void setDepth(int depth)
	{
		this.depth = depth;
	}
	
	public int getX()
	{
		return this.x;
	}
	public int getY()
	{
		return this.y;
	}
	public int getWidth()
	{
		return this.width;
	}
	public int getDepth()
	{
		return this.depth;
	}
	
	public String toString()
	{
		return this.x + "," + this.y + "," + this.width + "," + this.depth;
	}
}
