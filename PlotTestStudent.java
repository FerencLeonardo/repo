import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlotTestStudent {
	private Plot plot1, plot2, plot3;
	
	@BeforeEach
	void setUp() throws Exception {
		plot1 = new Plot(2, 2, 6, 6);
		plot2 = new Plot(3, 4, 4, 3);
		plot3 = new Plot(10, 10, 3, 3);
	}

	@AfterEach
	void tearDown() throws Exception {
		plot1 = plot2 = plot3 = null;
	}

	@Test
	void testPlot() {
		plot1 = new Plot();
		assertEquals("0,0,1,1",plot1.toString());
	}

	@Test
	void testOverlaps() {
		assertTrue(plot1.overlaps(plot2));
		assertFalse(plot1.overlaps(plot3));
		
		
	}

	@Test
	void testEncompasses() {
		assertTrue(plot1.encompasses(plot2));
		assertFalse(plot2.encompasses(plot1));
	}

	@Test
	void testSetX() {
		plot1.setX(0);
		assertEquals(0, plot1.getX());
	}

	@Test
	void testSetDepth() {
		plot1.setDepth(1);
		assertEquals(1, plot1.getDepth());
	}

	@Test
	void testGetY() {
		assertEquals(2, plot1.getY());
	}

	@Test
	void testGetWidth() {
		assertEquals(6, plot1.getWidth());
	}

	@Test
	void testToString() {
		assertEquals("3,4,4,3",plot2.toString());
	}

}
