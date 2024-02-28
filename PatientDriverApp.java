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

public class PatientDriverApp 
{

	public static void main(String[] args) 
	{
		Patient p = new Patient("Jenny", "Elaine", "Santori", "123 Main Street", "MyTown", "CA", "01234", "(240)999-9910", "Bill Santori", "777-555-1212");
		
		Procedure pro1 = new Procedure();
		pro1.setProcedureName("Physical Exam");
		pro1.setProcedureDate("7/20/19");
		pro1.setDoctor("Dr. Irvine");
		pro1.setCharge(3250.0);
		
		Procedure pro2 = new Procedure("X-ray", "7/20/19");
		pro2.setDoctor("Dr. Jamison");
		pro2.setCharge(5500.43);
		
		Procedure pro3 = new Procedure("Blood Test", "7/20/19", "Dr. Smith", 1400.75);
		
		System.out.println("Patient info:");
		displayPatient(p);
		displayProcedure(pro1);
		displayProcedure(pro2);
		displayProcedure(pro3);
		System.out.println("Total Charges: $" + calculateTotalCharges(pro1, pro2, pro3));
		
		System.out.println("\nStudent Name: Ferenc Leonardo Livak\nMC#: 21169185\nDue Date: 02/27/2024");
	}
	
	public static void displayPatient(Patient patient)
	{
		System.out.println("  Name: " + patient.buildFullName());
		System.out.println("  Address: " + patient.buildAddress());
		System.out.println("  EmergencyContact: " + patient.buildEmergencyContact());
		System.out.println("");
	}
	
	public static void displayProcedure(Procedure procedure)
	{
		System.out.println("  \tProcedure: " + procedure.getProcedureName());
		System.out.println("  \tProcedureDate=" + procedure.getProcedureDate());
		System.out.println("  \tPractitioner=" + procedure.getDoctor());
		System.out.println("  \tCharge=" + procedure.getCharge());
		System.out.println("");
	}
	
	public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3)
	{
		return procedure1.getCharge() + procedure2.getCharge() + procedure3.getCharge();
	}

	
}

//TEST
//		Patient p = new Patient("Jenny", "Elaine", "Santori", "123 Main Street", "MyTown", "CA", "01234", "(240)999-9910", "Bill Santori", "(240)999-9920");
//		System.out.println(p);