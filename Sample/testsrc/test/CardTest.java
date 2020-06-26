package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {

	@Test
	public void testGetNumber() {
		Card card = new Card(1, "spade");
		String getNumber = card.getNumber();
		assertEquals("1",getNumber);
	}

}
