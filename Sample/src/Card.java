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
		} else if (Number == 14) {
			s = "joker";
		}
		return s;

	}

	public String getMark() {
		return Mark;
	}

	public static Card createJoker() {
		return new Card(14, "joker");
	}

	int compareTo(Card anotherCard) {
		int num1 = this.Number;
		int num2 = anotherCard.Number;

		if (num1 > num2) {
			return 1;
		} else if (num1 < num2) {
			return -1;
		} else {
			return 0;
		}
	}
}
