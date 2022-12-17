// junit5 
package my.test;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
//		System.out.println("testing");
		FirstTest oFirstTest = new FirstTest();
		
		int val1 = 40;
		int val2 = oFirstTest.add(10, 30);
		assertEquals(val1, val2);
//		assertNotEquals(val1, val2);

		String name1="rajan";
		String name2=oFirstTest.name();
		assertEquals(name1, name2);
//		assertNotEquals("rajan", name2);
	}

}
