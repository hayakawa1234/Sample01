import java.util.List;

public class Card {
	public String Mark;
	public int Number;
	public List<Card> Joker;

	Card(int num, String ma) {
		Number = num;
		Mark = ma;
	}

	public String getNumber() {
		String s = String.valueOf(Number);
		if (Number == 11) {
			s = "jack";
		} else if (Number == 12) {
			s = "queen";
		} else if (Number == 13) {
			s = "king";
		}
		return s;

	}

	public String getMark() {
		return Mark;
	}

	public static Card createJoker() {
		return new Card(14, "joker");
	}

}
