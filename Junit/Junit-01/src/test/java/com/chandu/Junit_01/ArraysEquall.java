package com.chandu.Junit_01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysEquall {

	@Test
	void test() {
	
		int actual []= {4,2,6,8};
		int expected []= {2,4,6,8};
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
		
	}

}
