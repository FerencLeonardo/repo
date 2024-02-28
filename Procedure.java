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

public class Procedure 
{
	//FIELDS
	private String procedureName;
	private String procedureDate;
	private String doctor;
	private double charge;
	
	//CONSTRUCTORS
	public Procedure()
	{
		this.procedureName = "N/A";
		this.procedureDate = "N/A";
		this.doctor = "N/A";
		this.charge = 0;
	}
	public Procedure(String procedureName, String procedureDate)
	{
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.doctor = "N/A";
		this.charge = 0;
	}
	public Procedure(String procedureName, String procedureDate, String doctor, double charge)
	{
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.doctor = doctor;
		this.charge = charge;
	}
	
	//GET METHODS
	public String getProcedureName()
	{
		return procedureName;
	}
	public String getProcedureDate()
	{
		return procedureDate;
	}
	public String getDoctor()
	{
		return doctor;
	}
	public double getCharge()
	{
		return charge;
	}
	
	//SET METHODS
	public void setProcedureName(String procedureName)
	{
		this.procedureName = procedureName;
	}
	public void setProcedureDate(String procedureDate)
	{
		this.procedureDate = procedureDate;
	}
	public void setDoctor(String doctor)
	{
		this.doctor = doctor;
	}
	public void setCharge(double charge)
	{
		this.charge = charge;
	}
	
	//METHODS
	public String toString()
	{
		return procedureName + ' ' + procedureDate + ' ' + doctor + ' ' + charge;
	}
}
