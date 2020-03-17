import java.util.*;
import java.util.Random;

class Deck {
	public List<Card> cards;
	int Total;
	
	Deck(int to) {
		Total = to;
	}

	public String cardDraw() {
		return cards;
	}
}


class Card  {
	
	public String Mark;
	public String Number;
	
	public void setNumber(String num) {
		Number = num;
	}
	
	public void setMark(String ma) {
		Mark = ma;
	}
	

	public String getNumber() {
		return Number;
	}

	public String getMark() {
		return Mark;
	}

}

public class Exercise {

	public static void main(String[] args) {
		Deck deck1 = new Deck(54);
		Card card1 = new Card();
		String mark;
		String number;
		card1.setMark("spade");
		card1.setNumber("10");
		number = card1.getNumber();
		mark = card1.getMark();
		System.out.println(number + "," + mark);

	}

}
