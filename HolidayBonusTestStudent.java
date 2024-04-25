import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class HolidayBonusTestStudent {
	private double[][] dataSet = {{1,2,3},{4,5},{6,7,8,9}};

	@Test
	void testCalculateHolidayBonus() {
		double[] bonusArray = HolidayBonus.calculateHolidayBonus(dataSet);
		assertEquals(bonusArray[0], 3000);
		assertEquals(bonusArray[1], 4000);
		assertEquals(bonusArray[2], 20000);
	}

	@Test
	void testCalculateTotalHolidayBonus() {
		assertEquals(HolidayBonus.calculateTotalHolidayBonus(dataSet), 27000);
	}

}
