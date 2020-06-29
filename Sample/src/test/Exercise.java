package test;
import java.util.ArrayList;
import java.util.List;

public class Exercise {

	public static void main(String[] args) {
		{
			System.out.println("�g�����v������ ");
			Deck deck = new Deck();
			for (int i = 0; i < deck.size(i); i++) {
				Card drawcard = deck.draw();
				String number = drawcard.getNumber();
				String mark = drawcard.getMark();
				System.out.println(number + "," + mark);
			}
		}

		{

			System.out.println("�V���b�t�������g�����v������");
			Deck deck = new Deck();
			deck.shuffle();
			for (int i = 0; i < deck.size(i); i++) {
				Card drawcard = deck.draw();
				String number = drawcard.getNumber();
				String mark = drawcard.getMark();
				System.out.println(number + "," + mark);
			}
		}

		{

			System.out.println(" ");
			System.out.println("�g�����v��1������");
			Deck deck = new Deck();
			Card drawcard = deck.draw();
			String number = drawcard.getNumber();
			String mark = drawcard.getMark();
			System.out.println(number + "," + mark);
			deck.put(drawcard);
			Card drawcard1 = deck.draw();
			String number1 = drawcard1.getNumber();
			String mark1 = drawcard1.getMark();
			System.out.println(number1 + "," + mark1);

		}

		{

			System.out.println(" ");
			System.out.println("55���J�[�h������");
			Deck deck = new Deck();
			for (int i = 0; i < 55; i++) {
				Card drawcard = deck.draw();
				if (drawcard == null) {
					System.out.println("�����J�[�h������܂���I");
				} else {
					String number = drawcard.getNumber();
					String mark = drawcard.getMark();
					System.out.println(number + "," + mark);
				}
			}
		}

		{
			System.out.println(" ");
			System.out.println("�������G���ɕς���");
			Deck deck = new Deck();
			for (int i = 0; i < 54; i++) {
				Card drawcard = deck.draw();
				String number = drawcard.getNumber();
				String mark = drawcard.getMark();
				System.out.println(number + "," + mark);
			}

		}

		{
			System.out.println(" ");
			System.out.println("�T�C�Y��ύX����");
			Deck deck = new Deck();
			for (int i = 0; i < 54; i++) {
				int size = deck.size(i);
				System.out.println(size);
				deck.draw();
			}
		}

		{
			System.out.println(" ");
			System.out.println("�W���[�J�[�����");
			Card joker = Card.createJoker();
			String number = joker.getNumber();
			String mark = joker.getMark();
			System.out.println(number + "," + mark);
		}

		{
			System.out.println(" ");
			System.out.println("�J�[�h��r������");
			Deck deck = new Deck();
			deck.shuffle();
			Card drawcard1 = deck.draw();
			String number1 = drawcard1.getNumber();
			String mark1 = drawcard1.getMark();
			System.out.println(number1 + "," + mark1);
			deck.shuffle();
			Card drawcard2 = deck.draw();
			String number2 = drawcard2.getNumber();
			String mark2 = drawcard2.getMark();
			System.out.println(number2 + "," + mark2);
			drawcard1.compareTo(drawcard2);
			int com = drawcard1.compareTo(drawcard2);
			if (com > 0) {
				System.out.println(number1 + "," + mark1 + "������");
			} else if (com < 0) {
				System.out.println(number2 + "," + mark2 + "������");
			} else {
				System.out.println("���������ł�");
			}
		}

		{
			//			- �J�[�h��5�������čł������J�[�h��\������B
			//			- �f�b�L�ɃJ�[�h��߂��Ĉ����Ɠ����J�[�h���o������B
			//			- �J�[�h�C���X�^���X���쐬���f�b�L�ɐςݍ��ނƂ��̃J�[�h���o������B

			System.out.println(" ");
			System.out.println("�J�[�h��5�������čł������J�[�h��\������");

			Card drawcard1 = new Card(10, "dia");
			Card drawcard2 = new Card(6, "spade");
			Card drawcard3 = new Card(10, "spade");
			Card drawcard4 = new Card(10, "heart");
			Card drawcard5 = new Card(12, "clover");

			List<Card> cardList = new ArrayList<Card>();

			cardList.add(drawcard1);
			cardList.add(drawcard2);
			cardList.add(drawcard3);
			cardList.add(drawcard4);
			cardList.add(drawcard5);

			for (int i = 0; i < cardList.size(); i++) {
				Card card = cardList.get(i);
				boolean result = true;
				for (int j = 0; j < cardList.size(); j++) {
					Card anothercard = cardList.get(j);
					int compare = card.compareTo(anothercard);
					if (compare < 0)
						result = false;
				}

				if (result != false) {
					String num = card.getNumber();
					String mark = card.getMark();
					System.out.println(num + "," + mark);
				}
			}

		}

		{
			System.out.println(" ");
			System.out.println("�f�b�L�ɃJ�[�h��߂��Ĉ����Ɠ����J�[�h���o������B");
			Card drawcard1 = new Card(10, "dia");
			Card drawcard2 = new Card(6, "spade");
			Card drawcard3 = new Card(10, "spade");
			Card drawcard4 = new Card(10, "heart");
			Card drawcard5 = new Card(12, "clover");

			List<Card> cardList = new ArrayList<Card>();

			cardList.add(drawcard1);
			cardList.add(drawcard2);
			cardList.add(drawcard3);
			cardList.add(drawcard4);
			cardList.add(drawcard5);

			Deck deck = new Deck();

			for (int i = 0; i < cardList.size(); i++) {
				Card card = cardList.get(i);
				String num = card.getNumber();
				String mark = card.getMark();
				System.out.println(num + "," + mark);
				deck.put(card);
			}

			for (int j = 0; j < cardList.size(); j++) {
				Card drawcard = deck.draw();
				String num = drawcard.getNumber();
				String mark = drawcard.getMark();
				System.out.println(num + "," + mark);
			}
		}

		{
			System.out.println(" ");
			System.out.println("�J�[�h��5����������N���XPlayer���쐬���āAPlayer���J�[�h��5�����L����B�i�ǂ�����ď��������邩�͎��R�Ɂj");
			Card drawcard1 = new Card(10, "dia");
			Card drawcard2 = new Card(6, "spade");
			Card drawcard3 = new Card(10, "spade");
			Card drawcard4 = new Card(10, "heart");
			Card drawcard5 = new Card(12, "clover");
			Deck deck = new Deck();
			deck.shuffle();

			Player player = new Player();
			player.addCard(drawcard1);
			player.addCard(drawcard2);
			player.addCard(drawcard3);
			player.addCard(drawcard4);
			player.addCard(drawcard5);
			player.isOnePair();
			if(true) {
				System.out.println("OnePair�ł��B");
			}
		}

		{
			System.out.println(" ");
			System.out.println("�J�[�h��5����������N���XPlayer���쐬���āAPlayer���J�[�h��5�����L����B�i�ǂ�����ď��������邩�͎��R�Ɂj");
			Card drawcard1 = new Card(1, "heart");
			Card drawcard2 = new Card(3, "spade");
			Card drawcard3 = new Card(3, "heart");
			Card drawcard4 = new Card(4, "heart");
			Card drawcard5 = new Card(1, "spade");

			Player player = new Player();
			player.addCard(drawcard1);
			player.addCard(drawcard2);
			player.addCard(drawcard3);
			player.addCard(drawcard4);
			player.addCard(drawcard5);
			player.isTwoPair();
			if(true) {
				System.out.println("TwoPair�ł��B");
			}
		}

		{
			//�e�X�g�݌v
//			System.out.println(" ");
//			System.out.println("�e�X�g");
//			System.out.println(" ");
//			System.out.println("1,�g�����v�������e�X�g");
//			System.out.println("�܂���1�������Ă݂�B");
//			Deck deck = new Deck();
//			Card drawCard = deck.draw();
//			String number = drawCard.getNumber();
//			String mark = drawCard.getMark();
//			System.out.println(number + "," + mark);
//		}
//
//		{
//			System.out.println("");
//			System.out.println("���ɔ�����27���������Ă݂�");
//			Deck deck = new Deck();
//			for(int i = 0; i < 27; i++) {
//				Card drawCard = deck.draw();
//				String number = drawCard.getNumber();
//				String mark = drawCard.getMark();
//				System.out.println(number + "," + mark);
//			}
//		}
//
//		{
//			System.out.println("");
//			System.out.println("����54�������Ă݂�");
//			Deck deck = new Deck();
//			for(int i = 0; i < deck.size(i); i++) {
//				Card drawCard = deck.draw();
//				String number = drawCard.getNumber();
//				String mark = drawCard.getMark();
//				System.out.println(number + "," + mark);
//			}
    	}
	}
}
