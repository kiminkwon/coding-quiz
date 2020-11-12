
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Day4Test { /* Day 4 Test */
	@Test
	public void testCase1() {
		int[] result= new int[2];
		result = Day4.nbMonths(12000, 8000, 1000, (float)1.5);
		
		assertArrayEquals(result,new int[] {0,4000});
	}
	
	@Test
	public void testCase2() {
		int[] result= new int[2];
		result = Day4.nbMonths(2000, 8000, 1000, (float)1.5);
		assertArrayEquals(result,new int[] {6,766});
	}
}
