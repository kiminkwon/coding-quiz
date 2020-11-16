
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Day6Test {
	@Test
	public void testCase1() {
		int result=Day6.missingValues(new int[] {1,1,1,2,2,3});
		
		assertEquals(result,18);
	}
	
	@Test
	public void testCase2() {
		int result=Day6.missingValues(new int[] {6, 5, 4, 100, 6, 5, 4, 100, 6, 5, 4, 200});
		assertEquals(result,4000000);
	}
	
	@Test
	public void testCase3() {
		int result=Day6.missingValues(new int[] {6, 5, 4, 120, 6, 5, 4, 100, 6, 5, 4, 200,120});
		assertEquals(result,4800000);
	}
}
