import static org.junit.Assert.*;

import org.junit.Test;

import mypkg.MyCalculator;

public class MyTestCalc {
	
	MyCalculator ob = new MyCalculator();

	@Test
	public void testSum() {

		assertEquals(30, ob.sum(20,10));		
	}
	
	@Test
	public void testDiff() {

		assertEquals(10, ob.diff(20,10));
		
	}

}
