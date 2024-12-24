package com.chandu.Junit_01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		
		Calc c = new Calc();
		
		int actualResult=c.add(3, 4);
		int expectedResult=4;
		assertEquals(expectedResult, actualResult);
		
	}

}
