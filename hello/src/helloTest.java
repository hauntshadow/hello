import static org.junit.Assert.*;

import org.junit.Test;


public class helloTest {

	@Test
	public void testNoArg() {
		String ans = "Hello Chris.";
		assertEquals("No arg test failed", ans, main());
	}
	
	@Test
	public void testOneArg() {
		String ans = "Hello Human.";
		assertEquals("One arg test failed", ans, main("Human"));
	}
	
	@Test
	public void testOneArg2() {
		String ans = "Hello People.";
		assertEquals("One arg 2 test failed", ans, main("People"));
	}
	
	@Test
	public void testTwoArg() {
		String ans = "Hello Person.  I am Computo.  How are you today?";
		assertEquals("Two arg test failed", ans, main("Computo", "Person"));
	}
	
	@Test
	public void testTwoArg2() {
		String ans = "Hello Minions.  I am Leader.  How are you today?";
		assertEquals("Two arg 2 test failed", ans, main("Leader", "Minions"));
	}

}
