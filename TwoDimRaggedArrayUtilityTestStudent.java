import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import org.junit.jupiter.api.Test;

class TwoDimRaggedArrayUtilityTestStudent {
	private double[][] dataSet = {{1,2,3},{4,5},{6,7,8,9}};

	@Test
	void testReadFile() throws FileNotFoundException {
		File file = new File("C:\\Users\\leoli\\Desktop\\College\\Spring 2024\\CompSci\\Projects\\Project5\\Assignment5_holidayBonis_st - 061323\\district5.txt");
		TwoDimRaggedArrayUtility.readFile(file);
	}

	@Test
	void testWriteToFile() throws FileNotFoundException {
		File file = new File("C:\\Users\\leoli\\Desktop\\College\\Spring 2024\\CompSci\\Projects\\Project5\\Assignment5_holidayBonis_st - 061323\\district5.txt");
		TwoDimRaggedArrayUtility.writeToFile(dataSet, file);
	}

	@Test
	void testGetTotal() {
		assertEquals(TwoDimRaggedArrayUtility.getTotal(dataSet), 45.0);
	}

	@Test
	void testGetRowTotal() {
		assertEquals(TwoDimRaggedArrayUtility.getRowTotal(dataSet, 0), 6.0);
	}

	@Test
	void testGetLowestInRowIndex() {
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet, 0), 0);
	}

	@Test
	void testGetLowestInRow() {
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRow(dataSet, 2), 6.0);
	}

	@Test
	void testGetLowestInColumnIndex() {
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet, 2), 0);
	}

	@Test
	void testGetLowestInColumn() {
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumn(dataSet, 2), 3.0);
	}

	@Test
	void testGetLowestInArray() {
		assertEquals(TwoDimRaggedArrayUtility.getLowestInArray(dataSet), 1.0);
	}

	@Test
	void testGetHighestInRowIndex() {
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet, 2), 3);
	}

	@Test
	void testGetHighestInRow() {
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRow(dataSet, 2), 9.0);
	}

	@Test
	void testGetHighestInColumnIndex() throws FileNotFoundException {
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet, 3), 2);
	}

	@Test
	void testGetHighestInColumn() throws FileNotFoundException {
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumn(dataSet, 3), 9.0);
	}

	@Test
	void testGetHighestInArray() {
		assertEquals(TwoDimRaggedArrayUtility.getHighestInArray(dataSet), 9.0);
	}

	@Test
	void testGetColumnTotal() {
		assertEquals(TwoDimRaggedArrayUtility.getColumnTotal(dataSet, 0), 11.0);
	}

	@Test
	void testGetAverage() {
		assertEquals(TwoDimRaggedArrayUtility.getAverage(dataSet), 5.0);
	}

}
