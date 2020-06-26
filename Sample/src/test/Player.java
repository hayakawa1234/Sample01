package test;
import java.util.ArrayList;
import java.util.List;

//- �J�[�h��5����������N���XPlayer���쐬���āAPlayer���J�[�h��5�����L����B�i�ǂ�����ď��������邩�͎��R�Ɂj
//- Player��isOnePair, isTwoPair ���\�b�h����������B
//- Player��changeCard(int cardIndex)����������B
//- �v�����g������g����5������J�[�h�`�F���W�����[1-5]�őI�΂���B

public class Player {

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
		int count = 0;
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
		} else {
			return false;
		}
	}

	public int changeCard(int cardIndex) {
		return 0;
	}

}