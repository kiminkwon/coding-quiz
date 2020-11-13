package day5;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Day5Test {
	@Test
	public void test1() {
		int result=Day5.getIndex(new int[] {1,2,3,4,3,2,1});
		assertEquals(result,3);
	}
	
	@Test
	public void test2() {
		int result=Day5.getIndex(new int[] {20,10,-80,10,10,15,35});
		assertEquals(result,0);
	}
	@Test
	public void test3() {
		int result=Day5.getIndex(new int[] {1,2,3,4,3,2,2});
		assertEquals(result,-1);
	}

}
