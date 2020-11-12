package day3;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Day3Test {
	@Test
	public void testCase1() {
		Day3 d3 = new Day3(); 
		int result = d3.getArraysNum(new int[][] {
			{1,2},
			{4},
			{5,6}
		}) ;
		assertEquals(result,4);
	}
	@Test
	public void testCase2() {
		Day3 d3 = new Day3(); 
		int result = d3.getArraysNum(new int[][] {
			{1,2},
			{4,4},
			{5,6,6}
		}) ;
		assertEquals(result,4);
	}
	@Test
	public void testCase3() {
		Day3 d3 = new Day3(); 
		int result = d3.getArraysNum(new int[][] {
			{1,2},
			{3,4},
			{5,6}
		}) ;
		assertEquals(result,8);
	}
	@Test
	public void testCase4() {
		Day3 d3 = new Day3(); 
		int result = d3.getArraysNum(new int[][] {
			{1,2,3},
			{3,4,6,6,7},
			{8,9,10,12,5,6}
		}) ;
		assertEquals(result,72);
	}
}
