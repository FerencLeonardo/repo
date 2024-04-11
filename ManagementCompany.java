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

public class ManagementCompany {
	public final int MAX_PROPERTY = 5;
	public final int MGMT_WIDTH = 10;
	public final int MGMT_DEPTH = 10;
	
	private String name;
	private String taxID;
	private double mgmFee;
	private Plot plot;
	
	private Property[] properties;
	
	public ManagementCompany()
	{
		this.name = "";
		this.taxID = "";
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}
	public ManagementCompany(String name, String taxID, double mgmFee)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.plot = new Plot(x, y, width, depth);
		this.properties = new Property[MAX_PROPERTY];
	}
	public ManagementCompany(ManagementCompany otherCompany)
	{
		this.name = otherCompany.getName();
		this.taxID = otherCompany.getTaxID();
		this.mgmFee = otherCompany.getMgmFee();
		this.plot = otherCompany.getPlot();
		this.properties = new Property[MAX_PROPERTY];
	}
	
	public int addProperty(String name, String city, double rent, String owner)
	{
		Property property = new Property(name, city, rent, owner);
		int numProperties = getPropertiesCount();
		if (isPropertiesFull())
		{
			return -1;
		}
		if (property.equals(null))
		{
			return -2;
		}
		if (!(this.plot.encompasses(property.getPlot())))
		{
			return -3;
		}
		for (int i = 0; i < numProperties; i++)
		{
			if (properties[i].getPlot().overlaps(property.getPlot()))
			{
				return -4;
			}
		}
		properties[numProperties] = new Property(property);
		return numProperties - 1;
	}
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth)
	{
		Property property = new Property(name, city, rent, owner, x, y, width, depth);
		int numProperties = getPropertiesCount();
		if (isPropertiesFull())
		{
			return -1;
		}
		if (property.equals(null))
		{
			return -2;
		}
		if (!(this.plot.encompasses(property.getPlot())))
		{
			return -3;
		}
		for (int i = 0; i < numProperties; i++)
		{
			if (properties[i].getPlot().overlaps(property.getPlot()))
			{
				return -4;
			}
		}
		properties[numProperties] = new Property(property);
		return numProperties - 1;

	}
	public int addProperty(Property property)
	{
		property = new Property(property);
		int numProperties = getPropertiesCount();
		if (isPropertiesFull())
		{
			return -1;
		}
		if (property.equals(null))
		{
			return -2;
		}
		if (!(this.plot.encompasses(property.getPlot())))
		{
			return -3;
		}
		for (int i = 0; i < numProperties; i++)
		{
			if (properties[i].getPlot().overlaps(property.getPlot()))
			{
				return -4;
			}
		}
		properties[numProperties] = new Property(property);
		return numProperties;
	}
	
	public void removeLastProperty()
	{
		int numProperties = getPropertiesCount();
		properties[numProperties - 1] = null;
	}
	
	public boolean isPropertiesFull()
	{
		if (getPropertiesCount() == MAX_PROPERTY)
		{
			return true;
		}
		return false;
	}
	
	public int getPropertiesCount()
	{
		int numProperties = properties.length;
		for (int i = 0; i < properties.length; i++)
		{
			if (properties[i] == null)
			{
				numProperties--;
			}
		}
		return numProperties;
	}
	
	public double getTotalRent()
	{
		int numProperties = getPropertiesCount();
		double total = 0;
		for (int i = 0; i < numProperties; i++)
		{
			total += properties[i].getRentAmount();
		}
		return total;
	}
	
	public Property getHighestRentPropperty()
	{
		int numProperties = getPropertiesCount();
		double highestRent = properties[0].getRentAmount();
		Property property = new Property(properties[0]);
		for (int i = 1; i < numProperties; i++)
		{
			if (highestRent < properties[i].getRentAmount())
			{
				highestRent = properties[i].getRentAmount();
				property = new Property(properties[i]);
			}
		}
		return new Property(property);
	}
	
	public boolean isMangementFeeValid()
	{
		if (mgmFee >= 0 && mgmFee <= 100)
		{
			return true;
		}
		return false;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setTaxID(String taxID)
	{
		this.taxID = taxID;
	}
	public void setMgmFee(double mgmFee)
	{
		this.mgmFee = mgmFee;
	}
	public void setPlot(Plot plot)
	{
		this.plot = new Plot(plot);
	}
	
	public String getName()
	{
		return this.name;
	}
	public String getTaxID()
	{
		return this.taxID;
	}
	public double getMgmFee()
	{
		return this.mgmFee;
	}
	public Plot getPlot()
	{
		return new Plot(this.plot);
	}
	
	public String toString()
	{
		String result_text = "List of the properties for " + name + ", taxID: " + taxID + "\n______________________________________________________\n";
		for (int i = 0; i < getPropertiesCount(); i++)
		{
			result_text += properties[i].toString() + "\n";
		}
		result_text += "______________________________________________________\n\n total management Fee: " + getTotalRent() * mgmFee / 100;
		return result_text;
	}
}
