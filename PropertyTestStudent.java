import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTestStudent {
	Property property1, property2;
	
	@BeforeEach
	void setUp() throws Exception {
		property1 = new Property("Property ABC", "Rockville", 2450.00, "Wells Fargo Bank");
		property2 = new Property("Property CSMC", "New York", 5000.00, "MC");
	}

	@AfterEach
	void tearDown() throws Exception {
		property1 = property2 = null;
	}

	@Test
	void testProperty() {
		property2 = new Property("Property CSMC", "Atlanta", 3000.00, "ATL");
		assertEquals("Property CSMC,Atlanta,ATL,3000.0",property2.toString());	
		assertEquals(0, property2.getPlot().getX());
		assertEquals(0, property2.getPlot().getY());
		assertEquals(1, property2.getPlot().getWidth());
		assertEquals(1, property2.getPlot().getDepth());
	}

	@Test
	void testSetPropertyName() {
		property1.setPropertyName("Prop 50");
		assertEquals("Prop 50", property1.getPropertyName());
	}

	@Test
	void testSetRentAmount() {
		property1.setRentAmount(2304.0);
		assertEquals(2304.0, property1.getRentAmount());
	}

	@Test
	void testSetPlot() {
		Plot plot1 = new Plot(0, 0, 10, 10);
		property1.setPlot(plot1);
		assertEquals(0, property1.getPlot().getX());
		assertEquals(0, property1.getPlot().getY());
		assertEquals(10, property1.getPlot().getWidth());
		assertEquals(10, property1.getPlot().getDepth());
	}

	@Test
	void testGetCity() {
		assertEquals("Rockville", property1.getCity());
	}

	@Test
	void testGetOwner() {
		assertEquals("MC", property2.getOwner());
	}

	@Test
	void testToString() {
		assertEquals("Property CSMC,New York,MC,5000.0",property2.toString());	
	}

}
