package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest1 {

	@Test
	public void testGetMark() {
		Card card = new Card(1, "spade");
		String getMark = card.getMark();
		assertEquals("spade",getMark);
	}

}
