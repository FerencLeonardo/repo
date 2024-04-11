import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagementCompanyTestStudent {
	Property sampleProperty;
	ManagementCompany managementCo; 
	
	@BeforeEach
	void setUp() throws Exception {
		managementCo = new ManagementCompany("Leo", "4141", 10);
		sampleProperty = new Property("Cool House", "Rockville", 5000.0, "John",2,2,2,2);		
	}

	@AfterEach
	void tearDown() throws Exception {
		managementCo = null;
		sampleProperty = null;
		
	}

	@Test
	void testManagementCompany() {
		managementCo = new ManagementCompany("Not Leo", "1414", 50);
		assertEquals(managementCo.addProperty(sampleProperty), 0);	//property has been successfully added to index 0
		String expectedString = "List of the properties for Not Leo, taxID: 1414\n"
				+ "______________________________________________________\n"
				+ "Cool House,Rockville,John,5000.0\n"
				+ "______________________________________________________\n"
				+"\n"
				+ " total management Fee: 2500.0";
		assertEquals(expectedString, managementCo.toString());
		
	}

	@Test
	void testAddPropertyProperty() {
		int index1 = managementCo.addProperty(sampleProperty);
		assertEquals(0, index1);
		int index2 = managementCo.addProperty(sampleProperty);
		assertEquals(-4, index2);
	}

	@Test
	void testRemoveLastProperty() {
		assertEquals(managementCo.addProperty(sampleProperty),0);	
		managementCo.removeLastProperty();
		assertEquals(managementCo.addProperty(sampleProperty),0);	
	}

	@Test
	void testIsPropertiesFull() {
		assertEquals(managementCo.addProperty(sampleProperty),0);	
		assertFalse(managementCo.isPropertiesFull());
	}

	@Test
	void testGetPropertiesCount() {
		Property sampleProperty2 = new Property("Cool House #2", "Rockville", 3000.0, "John",5,5,1,1);
		assertEquals(managementCo.addProperty(sampleProperty),0);	
		assertEquals(managementCo.addProperty(sampleProperty2),1);	
		assertEquals(managementCo.getPropertiesCount(), 2);
	}

	@Test
	void testGetTotalRent() {
		assertEquals(managementCo.addProperty(sampleProperty),0);
		assertEquals(managementCo.getTotalRent(), 5000.0);
	}

	@Test
	void testGetHighestRentPropperty() {
		Property sampleProperty2 = new Property("Cool House #2", "Rockville", 3000.0, "John",5,5,1,1);
		assertEquals(managementCo.addProperty(sampleProperty),0);	
		assertEquals(managementCo.addProperty(sampleProperty2),1);	
		assertEquals(managementCo.getHighestRentPropperty().getRentAmount(), 5000.0);
	}

	@Test
	void testIsMangementFeeValid() {
		assertTrue(managementCo.isMangementFeeValid());
	}

	@Test
	void testToString() {
		assertEquals(managementCo.addProperty(sampleProperty), 0);	//property has been successfully added to index 0
		String expectedString = "List of the properties for Leo, taxID: 4141\n"
				+ "______________________________________________________\n"
				+ "Cool House,Rockville,John,5000.0\n"
				+ "______________________________________________________\n"
				+"\n"
				+ " total management Fee: 500.0";
		assertEquals(expectedString, managementCo.toString());
	}

}
