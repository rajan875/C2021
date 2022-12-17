package my.logic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Sam2Test {

	@Test
	void testAdd() {
		Sam2 oSam2=new Sam2();
		int val1=oSam2.add(10, 20);
		assertEquals(30, val1);


	}
	@Test
	void testArea() {
		Sam2 oSam2=new Sam2();
		double val3=oSam2.area(10);
		assertEquals(314.1592653589793, val3);
	}
	
	@Test
	void testSub() {
		Sam2 oSam2=new Sam2();
		int val4=oSam2.sub(50,20);
		assertEquals(30, val4);
	}
}
