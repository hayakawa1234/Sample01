package test;

import java.util.ArrayList;
import java.util.List;

//- カードを5枚所持するクラスPlayerを作成して、Playerがカードを5枚所有する。（どうやって所持させるかは自由に）
//- PlayerにisOnePair, isTwoPair メソッドを実装する。
//- PlayerにchangeCard(int cardIndex)を実装する。
//- プリント文を駆使して5枚からカードチェンジを入力[1-5]で選ばせる。

public class Player {

	int count = 0;
	List<Card> cardList = new ArrayList<Card>();

	public void addCard(Card card) {
		cardList.add(0, card);
	}

	public boolean isOnePair() {
		for (int i = 0; i < cardList.size(); i++) {
			Card card = cardList.get(i);
			for (int j = 0; j < cardList.size(); j++) {
				if (i != j) {
					Card anothercard = cardList.get(j);
					int compare = card.compareTo(anothercard);
					if (compare == 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean isTwoPair() {
		for (int i = 0; i < cardList.size(); i++) {
			Card card = cardList.get(i);
			for (int j = 0; j < cardList.size(); j++) {
				if (i != j) {
					Card anothercard = cardList.get(j);
					int compare = card.compareTo(anothercard);
					if (compare == 0) {
						count++;
					}

				}
			}
		}
		if (count == 4) {
			return true;
		}
		return false;
	}

	public boolean isThreeCards() {
		for (int i = 0; i < cardList.size(); i++) {
			Card card = cardList.get(i);
			boolean result = true;
			for (int j = 0; j < cardList.size(); j++) {
				if (i != j) {
					Card anothercard = cardList.get(j);
					int compare = card.compareTo(anothercard);
					if (compare == 0) {
						result = false;
					}
					for (int k = 0; k < cardList.size(); k++) {
						if (i != k && j != k && i != j) {
							Card secondAnotherCard = cardList.get(k);
							int secondCompare = card.compareTo(secondAnotherCard);
							if (secondCompare == 0 && result == false) {
								result = true;
								return true;
							}
						}

					}
				}

			}
		}

		return false;
	}

	public int changeCard(int cardIndex) {
		return 0;
	}

}
