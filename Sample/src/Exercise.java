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
			Card drawcard1 = new Card(9, "dia");
			Card drawcard2 = new Card(6, "spade");
			Card drawcard3 = new Card(3, "dia");
			

			int num1_2 = drawcard1.compareTo(drawcard2);
			System.out.println(num1_2);
			int num1_3 = drawcard1.compareTo(drawcard3);
			System.out.println(num1_3);
			int num2_1 = drawcard2.compareTo(drawcard1);
			System.out.println(num2_1);
			int num2_3 = drawcard2.compareTo(drawcard3);
			System.out.println(num2_3);
			int num3_1 = drawcard3.compareTo(drawcard1);
			System.out.println(num3_1);
			int num3_2 = drawcard3.compareTo(drawcard2);
			System.out.println(num3_2);

			if ((num1_2 >= 0) && (num1_3 >= 0)) {
				String number1 = drawcard1.getNumber();
				String mark1 = drawcard1.getMark();
				System.out.println(number1 + "," + mark1);
			}

			if ((num2_1 >= 0) && (num2_3 >= 0)) {
				String number2 = drawcard2.getNumber();
				String mark2 = drawcard2.getMark();
				System.out.println(number2 + "," + mark2);
			}

			if ((num3_1 >= 0) && (num3_2 >= 0)) {
				String number3 = drawcard3.getNumber();
				String mark3 = drawcard3.getMark();
				System.out.println(number3 + "," + mark3);
			}
		}
	}
}
