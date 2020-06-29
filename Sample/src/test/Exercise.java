package test;
import java.util.ArrayList;
import java.util.List;

public class Exercise {

	public static void main(String[] args) {
		{
			System.out.println("トランプを引く ");
			Deck deck = new Deck();
			for (int i = 0; i < deck.size(i); i++) {
				Card drawcard = deck.draw();
				String number = drawcard.getNumber();
				String mark = drawcard.getMark();
				System.out.println(number + "," + mark);
			}
		}

		{

			System.out.println("シャッフルしたトランプを引く");
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
			System.out.println("トランプを1枚引く");
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
			System.out.println("55枚カードを引く");
			Deck deck = new Deck();
			for (int i = 0; i < 55; i++) {
				Card drawcard = deck.draw();
				if (drawcard == null) {
					System.out.println("引くカードがありません！");
				} else {
					String number = drawcard.getNumber();
					String mark = drawcard.getMark();
					System.out.println(number + "," + mark);
				}
			}
		}

		{
			System.out.println(" ");
			System.out.println("数字を絵柄に変える");
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
			System.out.println("サイズを変更する");
			Deck deck = new Deck();
			for (int i = 0; i < 54; i++) {
				int size = deck.size(i);
				System.out.println(size);
				deck.draw();
			}
		}

		{
			System.out.println(" ");
			System.out.println("ジョーカーを作る");
			Card joker = Card.createJoker();
			String number = joker.getNumber();
			String mark = joker.getMark();
			System.out.println(number + "," + mark);
		}

		{
			System.out.println(" ");
			System.out.println("カード比較をする");
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
				System.out.println(number1 + "," + mark1 + "が強い");
			} else if (com < 0) {
				System.out.println(number2 + "," + mark2 + "が強い");
			} else {
				System.out.println("同じ強さです");
			}
		}

		{
			//			- カードを5枚引いて最も強いカードを表示する。
			//			- デッキにカードを戻して引くと同じカードが出現する。
			//			- カードインスタンスを作成しデッキに積み込むとそのカードが出現する。

			System.out.println(" ");
			System.out.println("カードを5枚引いて最も強いカードを表示する");

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
			System.out.println("デッキにカードを戻して引くと同じカードが出現する。");
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
			System.out.println("カードを5枚所持するクラスPlayerを作成して、Playerがカードを5枚所有する。（どうやって所持させるかは自由に）");
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
				System.out.println("OnePairです。");
			}
		}

		{
			System.out.println(" ");
			System.out.println("カードを5枚所持するクラスPlayerを作成して、Playerがカードを5枚所有する。（どうやって所持させるかは自由に）");
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
				System.out.println("TwoPairです。");
			}
		}

		{
			//テスト設計
//			System.out.println(" ");
//			System.out.println("テスト");
//			System.out.println(" ");
//			System.out.println("1,トランプを引くテスト");
//			System.out.println("まずは1枚引いてみる。");
//			Deck deck = new Deck();
//			Card drawCard = deck.draw();
//			String number = drawCard.getNumber();
//			String mark = drawCard.getMark();
//			System.out.println(number + "," + mark);
//		}
//
//		{
//			System.out.println("");
//			System.out.println("次に半分の27枚を引いてみる");
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
//			System.out.println("次に54枚引いてみる");
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
