import java.util.*;
import java.util.Collections;

class Deck {
	public List<Card> Cards;
	public Card Put;

	Deck() {
		List<Card> cards = new ArrayList<Card>();
		Card card1 = new Card(1, "spede");
		Card card2 = new Card(1, "heart");
		Card card3 = new Card(1, "clover");
		Card card4 = new Card(1, "dia");
		Card card5 = new Card(2, "spede");
		Card card6 = new Card(2, "heart");
		Card card7 = new Card(2, "clover");
		Card card8 = new Card(2, "dia");
		Card card9 = new Card(3, "spede");
		Card card10 = new Card(3, "heart");
		Card card11 = new Card(3, "clover");
		Card card12 = new Card(3, "dia");
		Card card13 = new Card(4, "spede");
		Card card14 = new Card(4, "heart");
		Card card15 = new Card(4, "clover");
		Card card16 = new Card(4, "dia");
		Card card17 = new Card(5, "spede");
		Card card18 = new Card(5, "heart");
		Card card19 = new Card(5, "clover");
		Card card20 = new Card(5, "dia");
		Card card21 = new Card(6, "spede");
		Card card22 = new Card(6, "heart");
		Card card23 = new Card(6, "clover");
		Card card24 = new Card(6, "dia");
		Card card25 = new Card(7, "spede");
		Card card26 = new Card(7, "heart");
		Card card27 = new Card(7, "clover");
		Card card28 = new Card(7, "dia");
		Card card29 = new Card(8, "spede");
		Card card30 = new Card(8, "heart");
		Card card31 = new Card(8, "clover");
		Card card32 = new Card(8, "dia");
		Card card33 = new Card(9, "spede");
		Card card34 = new Card(9, "heart");
		Card card35 = new Card(9, "clover");
		Card card36 = new Card(9, "dia");
		Card card37 = new Card(10, "spede");
		Card card38 = new Card(10, "heart");
		Card card39 = new Card(10, "clover");
		Card card40 = new Card(10, "dia");
		Card card41 = new Card(11, "spede");
		Card card42 = new Card(11, "heart");
		Card card43 = new Card(11, "clover");
		Card card44 = new Card(11, "dia");
		Card card45 = new Card(12, "spede");
		Card card46 = new Card(12, "heart");
		Card card47 = new Card(12, "clover");
		Card card48 = new Card(12, "dia");
		Card card49 = new Card(13, "spede");
		Card card50 = new Card(13, "heart");
		Card card51 = new Card(13, "clover");
		Card card52 = new Card(13, "dia");
		Card card53 = new Card(14, "joker");
		Card card54 = new Card(14, "joker");

		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);
		cards.add(card6);
		cards.add(card7);
		cards.add(card8);
		cards.add(card9);
		cards.add(card10);
		cards.add(card11);
		cards.add(card12);
		cards.add(card13);
		cards.add(card14);
		cards.add(card15);
		cards.add(card16);
		cards.add(card17);
		cards.add(card18);
		cards.add(card19);
		cards.add(card20);
		cards.add(card21);
		cards.add(card22);
		cards.add(card23);
		cards.add(card24);
		cards.add(card25);
		cards.add(card26);
		cards.add(card27);
		cards.add(card28);
		cards.add(card29);
		cards.add(card30);
		cards.add(card31);
		cards.add(card32);
		cards.add(card33);
		cards.add(card34);
		cards.add(card35);
		cards.add(card36);
		cards.add(card37);
		cards.add(card38);
		cards.add(card39);
		cards.add(card40);
		cards.add(card41);
		cards.add(card42);
		cards.add(card43);
		cards.add(card44);
		cards.add(card45);
		cards.add(card46);
		cards.add(card47);
		cards.add(card48);
		cards.add(card49);
		cards.add(card50);
		cards.add(card51);
		cards.add(card52);
		cards.add(card53);
		cards.add(card54);

		Cards = cards;
	}

	public Card draw() {
		return Cards.remove(0);
	}

	public void put(Card card) {
		Put = card;
	}

	public void shuffle() {
		Collections.shuffle(Cards);
		for (Card shuffledeck : Cards) {
			System.out.println(shuffledeck.getNumber() + shuffledeck.getMark());
		}
	}

	public int size() {
		return 54;
	}

}

class Card {
	public String Mark;
	public int Number;

	Card(int num, String ma) {
		Number = num;
		Mark = ma;
	}

	public String getNumber() {
		String s = String.valueOf(Number);
		return s;
	}

	public String getMark() {
		return Mark;
	}
}

public class Exercise {

	public static void main(String[] args) {
		Deck deck = new Deck();
		for (int i = 0; i < deck.size(); i++) {
			Card drowcard = deck.draw();
			String number = drowcard.getNumber();
			String mark = drowcard.getMark();
			System.out.println(number + "," + mark);
			System.out.println(" ");
			deck.put(drowcard);
			deck.shuffle();
			System.out.println(" ");
		}
	}
}
