package com.chandu.writeTest_Then_Write_Code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {

	@Test
	void testcomputeAreaSquare() {
		
		Shapes shape = new Shapes();
		assertEquals(576, shape.computeAreaSquare(24));
		
	}

}
