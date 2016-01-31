import static org.junit.Assert.*;

import org.junit.Test;

/**
 * helloTest.java
 * 
 * @author smithc4
 * @version 1.27.16
 */
public class helloTest {
	@Test
	public void testNoArg() {
		String ans = "Hello Chris.";
		assertEquals("No arg test failed", ans, hello.printHello(new String[]{}));
	}
	
	@Test
	public void testOneArg() {
		String ans = "Hello Human.";
		assertEquals("One arg test failed", ans, hello.printHello(new String[]{"Human"}));
	}
	
	@Test
	public void testOneArg2() {
		String ans = "Hello People.";
		assertEquals("One arg 2 test failed", ans, hello.printHello(new String[]{"People"}));
	}
	
	@Test
	public void testTwoArg() {
		String ans = "Hello Person. I am Computo. How are you today?";
		assertEquals("Two arg test failed", ans, hello.printHello(new String[]{"Computo", "Person"}));
	}
	
	@Test
	public void testTwoArg2() {
		String ans = "Hello Minions. I am Leader. How are you today?";
		assertEquals("Two arg 2 test failed", ans, hello.printHello(new String[]{"Leader", "Minions"}));
	}
	
	@Test
	public void testCorrectCase(){
		String ans = "Hello Correctcase.";
		assertEquals("Correct case test failed", ans, hello.printHello(new String[]{"correctcase"}));
	}
	
	@Test
	public void testCorrectCase2(){
		String ans = "Hello Correct. I am Case. How are you today?";
		assertEquals("Correct case test 2 failed", ans, hello.printHello(new String[]{"cASE", "cORRECT"}));
	}
}
