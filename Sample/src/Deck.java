import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	public List<Card> Cards;

	Deck() {
		List<Card> cards = new ArrayList<Card>();

		for (int i = 1; i <= 13; i++) {
			Card card1 = new Card(i, "spede");
			cards.add(card1);
			Card card2 = new Card(i, "heart");
			cards.add(card2);
			Card card3 = new Card(i, "clover");
			cards.add(card3);
			Card card4 = new Card(i, "dia");
			cards.add(card4);
		}
		Card card53 = Card.createJoker();
		cards.add(card53);
		Card card54 = Card.createJoker();
		cards.add(card54);

		Cards = cards;
	}

	public Card draw() {
		if (Cards.size() > 0) {
			return Cards.remove(0);
		} else {
			return null;
		}

	}

	public void put(Card card) {
		Cards.add(0, card);
	}

	public void add(Card card) {
		Cards.add(card);
	}

	public void shuffle() {
		Collections.shuffle(Cards);
	}

	public int size(int n) {
		n = Cards.size();
		return n;

	}

}
