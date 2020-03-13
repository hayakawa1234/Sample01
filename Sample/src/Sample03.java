import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ���K��� 7 - 5
 * �d�݂̓��ꕨ�̂悤�ȃN���X�ACoinCase ���쐬���Ȃ����B
 * 
 * 500 �~�A100 �~�A50 �~�A10 �~�A5 �~�A1 �~���A���ꂼ�ꉽ�����邩���Ǘ�����B
 * AddCoins ���\�b�h�ōd�݂�ǉ�����B
 * �����͍d�݂̎�ށi int �j�Ɩ����i int �j�B
 * GetCount ���\�b�h�ŁA�w�肵���d�݂��A�������邩���擾����B
 * �����͍d�݂̎�ށi int �j�A�߂�l�͖����i int �j�B
 * GetAmount ���\�b�h�ōd�݂̑��z���擾����B
 * �߂�l�͍d�݂̑��z( int )�B
 * CoinCase �N���X���g�p���Ď��̃v���O�������쐬���Ȃ����B
 * 
 * CoinCase �N���X�̃C���X�^���X���쐬����B
 * ��ނƖ�������͂��AAddCoins ���\�b�h�ōd�݂�ǉ����邱�Ƃ� 10 ��J��Ԃ��B
 * �e�d�݂��������邩��\������B
 * ���z��\������B
 * �� 	�d�݂̎�ނ� 500 �~�Ȃ琮���� 500�A100 �~�Ȃ� 100 �Ƃ��A�Y�����Ȃ������w�肳�ꂽ�ꍇ�ɂ͖�������B
 */

/**
 * @author hayak
 *
 */

class CoinCase {
	int coin500 = 4;
	int coin100 = 2;
	int coin50 = 3;
	int coin10 = 2;
	int coin5 = 5;
	int coin1 = 3;

	public void AddCoins(int sort, int num) {
		if (sort == 500) {
			coin500 = coin500 + num;
		} else if (sort == 100) {
			coin100 = coin100 + num;
		} else if (sort == 50) {
			coin50 = coin50 + num;
		} else if (sort == 10) {
			coin10 = coin10 + num;
		} else if (sort == 5) {
			coin5 = coin5 + num;
		} else {
			coin1 = coin1 + num;
		}
	}

	public int GetCount(int sort) {
		return coin100;
	}

	public int GetAmount() {
		return (coin500 * 500) + (coin100 * 100) + (coin50 * 50) + (coin10 * 10) + (coin5 * 5) + (coin1 * 1);
	}
}

public class Sample03 {

	public static void main(String[] args) {
		CoinCase coinCase = new CoinCase();
		int amount;

		amount = coinCase.GetAmount();
		System.out.println("���v�l��" + amount + "�~�ł�");

		coinCase.AddCoins(500, 3);
		amount = coinCase.GetAmount();
		System.out.println("���v�l��" + amount + "�~�ł�");

		coinCase.AddCoins(100, 2);
		amount = coinCase.GetAmount();
		System.out.println("���v�l��" + amount + "�~�ł�");

		coinCase.AddCoins(50, 4);
		amount = coinCase.GetAmount();
		System.out.println("���v�l��" + amount + "�~�ł�");

		coinCase.AddCoins(10, 3);
		amount = coinCase.GetAmount();
		System.out.println("���v�l��" + amount + "�~�ł�");

		coinCase.AddCoins(5, 4);
		amount = coinCase.GetAmount();
		System.out.println("���v�l��" + amount + "�~�ł�");

		coinCase.AddCoins(1, 3);
		amount = coinCase.GetAmount();
		System.out.println("���v�l��" + amount + "�~�ł�");

		int count;
		count = coinCase.GetCount(500);
		System.out.println(count + "���ł�");
		
		count = coinCase.GetCount(100);
		System.out.println(count + "���ł�");
		
		count = coinCase.GetCount(50);
		System.out.println(count + "���ł�");
		
		count = coinCase.GetCount(10);
		System.out.println(count + "���ł�");
		
		count = coinCase.GetCount(5);
		System.out.println(count + "���ł�");
		
		count = coinCase.GetCount(1);
		System.out.println(count + "���ł�");

	}
}
