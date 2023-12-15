package core;

//import java.util.Stack;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class JUNITStack extends TestCase{
	
	@Test
	public void testNewStack() {
		
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
		
	}
	
	public void testPushToTop() {
		Stack s1 = new Stack();
		assertFalse(s1.isFull());
		s1.push(new Integer(1));
		int topElm = (Integer)s1.top();
		assertEquals(1, topElm);
	}
}

