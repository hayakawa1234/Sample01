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

	}
}
