import java.util.ArrayList;
import java.util.List;

//- カードを5枚所持するクラスPlayerを作成して、Playerがカードを5枚所有する。（どうやって所持させるかは自由に）
//- PlayerにisOnePair, isTwoPair メソッドを実装する。
//- PlayerにchangeCard(int cardIndex)を実装する。
//- プリント文を駆使して5枚からカードチェンジを入力[1-5]で選ばせる。

public class Player {

	List<Card> cardList = new ArrayList<Card>();

	public void addCard(Card card) {
		cardList.add(0, card);
	}

	public boolean isOnePair() {
		for (int i = 0; i < cardList.size(); i++) {
			Card card = cardList.get(i);
			boolean result = true;
			for (int j = 0; j < cardList.size(); j++) {
				Card anothercard = cardList.get(j);
				int compare = card.compareTo(anothercard);
				if (compare == 0) {
					return true;
				}
			}
		}
		return false;
	}

	public String isTwoPair() {
		return null;
	}

	public int changeCard(int cardIndex) {
		return 0;
	}

}
