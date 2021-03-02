import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ArrOperationTest {
	int[] arr1 = {1, 2, 3, 4};
	int[] arr2 = {1, 2, 3, 8, 9, 3, 2, 1};
	int[] arr3 = {7, 1, 4, 9, 7, 4, 1};
	int[] arr4 = {1, 2, 1, 4};
	int[] arr5 = {1, 4, 5, 3, 5, 4, 1};
	int[] arr6 = {1, 2, 2, 3, 4, 4};
	int[] arr7 = {1, 1, 2, 1, 1};
	int[] arr8 = {1, 1, 1, 1, 1};
	int[] arr9 = {5, 4, 9, 4, 9, 5};
	int[] arr10 = {1, 4, 1, 5};
	int[] arr11 = {1, 4, 1, 5, 5, 4, 1};
	int[] arr12 = {1, 4, 1, 5};
	int[] arr13 = {1, 1, 1, 2, 1};
	int[] arr14 = {2, 1, 1, 2, 1};
	int[] arr15 = {10,10};
	
	
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMaxMirror() {
		ArrOperation arrOps = new ArrOperation();
		
		assertEquals(0,arrOps.maxMirror(arr1));
		assertEquals(3,arrOps.maxMirror(arr2));
		assertEquals(2,arrOps.maxMirror(arr3));
		assertEquals(3,arrOps.maxMirror(arr4));
		assertEquals(7,arrOps.maxMirror(arr5));
	}

	@Test
	public void testFindNumberOfClumps() {
		ArrOperation arrOps = new ArrOperation();
		
		assertEquals(2,arrOps.findNumberOfClumps(arr6));
		assertEquals(2,arrOps.findNumberOfClumps(arr7));
		assertEquals(1,arrOps.findNumberOfClumps(arr8));
		assertEquals(0,arrOps.findNumberOfClumps(arr4));
		assertEquals(0,arrOps.findNumberOfClumps(arr5));
	}

	@Test
	public void testFixXY() {
		ArrOperation arrOps = new ArrOperation();
		int [] arr9r = {9, 4, 5, 4, 5, 9};
		int [] arr10r = {1, 4, 5, 1};
		int [] arr11r = {1, 4, 5, 1, 1, 4, 5};
		int [] arr12r = {1, 4, 5, 1};
		assertArrayEquals(arr9r,arrOps.fixXY(arr9,4,5));
		assertArrayEquals(arr10r,arrOps.fixXY(arr10,4,5));
		assertArrayEquals(arr11r,arrOps.fixXY(arr11,4,5));
		assertArrayEquals(arr12r,arrOps.fixXY(arr12,4,5));

	}

	@Test
	public void testSplitArray() {
		ArrOperation arrOps = new ArrOperation();
		
		assertEquals(3,arrOps.splitArray(arr13));
		assertEquals(-1,arrOps.splitArray(arr14));
		assertEquals(1,arrOps.splitArray(arr15));

	}

}
