package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testIsOnepair() {
		{
			var player = new Player();
			var card1 = new Card(1, "heart");
			var card2 = new Card(2, "heart");
			var card3 = new Card(3, "heart");
			var card4 = new Card(4, "heart");
			var card5 = new Card(5, "heart");
			player.addCard(card1);
			player.addCard(card2);
			player.addCard(card3);
			player.addCard(card4);
			player.addCard(card5);
			assertFalse(player.isOnePair());
		}

		{
			var player = new Player();
			var card1 = new Card(1, "heart");
			var card2 = new Card(2, "heart");
			var card3 = new Card(3, "heart");
			var card4 = new Card(4, "heart");
			var card5 = new Card(1, "spade");
			player.addCard(card1);
			player.addCard(card2);
			player.addCard(card3);
			player.addCard(card4);
			player.addCard(card5);
			assertTrue(player.isOnePair());
		}
	}

	@Test
	public void TestIsTwoPair() {
		{
			var player = new Player();
			var card1 = new Card(1, "heart");
			var card2 = new Card(2, "heart");
			var card3 = new Card(3, "heart");
			var card4 = new Card(4, "heart");
			var card5 = new Card(5, "heart");
			player.addCard(card1);
			player.addCard(card2);
			player.addCard(card3);
			player.addCard(card4);
			player.addCard(card5);
			assertFalse(player.isTwoPair());
		}

		{
			var player = new Player();
			var card1 = new Card(1, "heart");
			var card2 = new Card(3, "spade");
			var card3 = new Card(3, "heart");
			var card4 = new Card(4, "heart");
			var card5 = new Card(1, "spade");
			player.addCard(card1);
			player.addCard(card2);
			player.addCard(card3);
			player.addCard(card4);
			player.addCard(card5);
			assertTrue(player.isTwoPair());
		}

	}

	@Test
	public void TestIsThreeCards() {
		{
			var player = new Player();
			var card1 = new Card(1, "heart");
			var card2 = new Card(2, "heart");
			var card3 = new Card(3, "heart");
			var card4 = new Card(4, "heart");
			var card5 = new Card(5, "heart");
			player.addCard(card1);
			player.addCard(card2);
			player.addCard(card3);
			player.addCard(card4);
			player.addCard(card5);
			assertFalse(player.isThreeCards());
		}

		{
			var player = new Player();
			var card1 = new Card(1, "heart");
			var card2 = new Card(3, "spade");
			var card3 = new Card(3, "heart");
			var card4 = new Card(4, "heart");
			var card5 = new Card(1, "spade");
			player.addCard(card1);
			player.addCard(card2);
			player.addCard(card3);
			player.addCard(card4);
			player.addCard(card5);
			assertTrue(player.isThreeCards());
		}

	}

}
