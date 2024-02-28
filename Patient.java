/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: The driver file uses the classes Patient and Procedure to print out information that is set to objects initialized in the same driver file.
 * Due: 02/27/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Ferenc Leonardo Livak
*/

public class Patient 
{
	//FIELDS
	private String fName;
	private String mName;
	private String lName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String emergencyName;
	private String emergencyPhone;
	
	//CONSTRUCTORS
	public Patient()
	{
		this.fName = "N/A";
		this.mName = "N/A";
		this.lName = "N/A";
		this.address = "N/A";
		this.city = "N/A";
		this.state = "N/A";
		this.zip = "N/A";
		this.phone = "N/A";
		this.emergencyName = "N/A";
		this.emergencyPhone = "N/A";
	}
	public Patient(String fName, String mName, String lName)
	{
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.address = "N/A";
		this.city = "N/A";
		this.state = "N/A";
		this.zip = "N/A";
		this.phone = "N/A";
		this.emergencyName = "N/A";
		this.emergencyPhone = "N/A";
	}
	public Patient(String fName, String mName, String lName, String address, String city, String state, String zip, String phone, String emergencyName, String emergencyPhone)
	{
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.emergencyName = emergencyName;
		this.emergencyPhone = emergencyPhone;
	}
	
	//GET METHODS
	public String getFName()
	{
		return fName;
	}
	public String getMName()
	{
		return mName;
	}
	public String getLName()
	{
		return lName;
	}
	public String getAddress()
	{
		return address;
	}
	public String getCity()
	{
		return city;
	}
	public String getState()
	{
		return state;
	}
	public String getZip()
	{
		return zip;
	}
	public String getPhone()
	{
		return phone;
	}
	public String getEmergencyName()
	{
		return emergencyName;
	}
	public String getEmergencyPhone()
	{
		return emergencyPhone;
	}
	
	//SET METHODS
	public void setFName(String fName)
	{
		this.fName = fName;
	}
	public void setMName(String mName)
	{
		this.mName = mName;
	}
	public void setLName(String lName)
	{
		this.lName = lName;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public void setZip(String zip)
	{
		this.zip = zip;
	}
	public void setEmergencyName(String emergencyName)
	{
		this.emergencyName = emergencyName;
	}
	public void setEmergencyPhone(String emergencyPhone)
	{
		this.emergencyPhone = emergencyPhone;
	}
	
	//METHODS
	public String buildFullName()
	{
		return fName + ' ' + mName + ' ' + lName;
	}
	public String buildAddress()
	{
		return address + ' ' + city + ' ' + state + ' ' + zip;
	}
	public String buildEmergencyContact()
	{
		return emergencyName + ' ' + emergencyPhone;
	}
	public String toString()
	{
		return buildFullName() + ' ' + buildAddress() + ' ' + phone + ' ' + buildEmergencyContact();
	}
}
