import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 練習問題 7 - 5
 * 硬貨の入れ物のようなクラス、CoinCase を作成しなさい。
 * 
 * 500 円、100 円、50 円、10 円、5 円、1 円が、それぞれ何枚あるかを管理する。
 * AddCoins メソッドで硬貨を追加する。
 * 引数は硬貨の種類（ int ）と枚数（ int ）。
 * GetCount メソッドで、指定した硬貨が、何枚あるかを取得する。
 * 引数は硬貨の種類（ int ）、戻り値は枚数（ int ）。
 * GetAmount メソッドで硬貨の総額を取得する。
 * 戻り値は硬貨の総額( int )。
 * CoinCase クラスを使用して次のプログラムを作成しなさい。
 * 
 * CoinCase クラスのインスタンスを作成する。
 * 種類と枚数を入力し、AddCoins メソッドで硬貨を追加することを 10 回繰り返す。
 * 各硬貨が何枚あるかを表示する。
 * 総額を表示する。
 * ※ 	硬貨の種類は 500 円なら整数の 500、100 円なら 100 とし、該当しない数が指定された場合には無視する。
 */

/**
 * @author hayak
 *
 */

class CoinCase {
	int coin500 = 0;
	int coin100 = 0;
	int coin50 = 0;
	int coin10 = 0;
	int coin5 = 0;
	int coin1 = 0;

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
		if (sort == 500) {
			return coin500;
		} else if (sort == 100) {
			return coin100;
		} else if (sort == 50) {
			return coin50;
		} else if (sort == 10) {
			return coin10;
		} else if (sort == 5) {
			return coin5;
		} else if (sort == 1) {
			return coin1;
		} else {
			return 0;
		}
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

		coinCase.AddCoins(500, 3);
		amount = coinCase.GetAmount();

		coinCase.AddCoins(100, 2);
		amount = coinCase.GetAmount();

		coinCase.AddCoins(50, 4);
		amount = coinCase.GetAmount();

		coinCase.AddCoins(10, 3);
		amount = coinCase.GetAmount();

		coinCase.AddCoins(5, 4);
		amount = coinCase.GetAmount();

		coinCase.AddCoins(1, 3);
		amount = coinCase.GetAmount();
		System.out.println("総額" + amount + "円です");

		int count;
		count = coinCase.GetCount(500);
		System.out.println(count + "枚です");

		count = coinCase.GetCount(100);
		System.out.println(count + "枚です");

		count = coinCase.GetCount(50);
		System.out.println(count + "枚です");

		count = coinCase.GetCount(10);
		System.out.println(count + "枚です");

		count = coinCase.GetCount(5);
		System.out.println(count + "枚です");

		count = coinCase.GetCount(1);
		System.out.println(count + "枚です");

		/**
		 * CoinCase クラスのインスタンスを作成する。 種類と枚数を入力し、AddCoins メソッドで硬貨を追加することを 10 回繰り返す。
		 * 各硬貨が何枚あるかを表示する。 総額を表示する。 ※ 硬貨の種類は 500 円なら整数の 500、100 円なら 100
		 * とし、該当しない数が指定された場合には無視する。
		 */

		
		  for (int i = 0; i < 10; i++) { coinCase.AddCoins(500, 2);
		  
		  coinCase.AddCoins(100, 3);
		  
		  coinCase.AddCoins(50, 6);
		  
		  coinCase.AddCoins(10, 5);
		  
		  coinCase.AddCoins(5, 4);
		  
		  coinCase.AddCoins(1, 1); }
		 

		int count1;
		count1 = coinCase.GetCount(500);
		System.out.println("500円玉は" + count1 + "枚です");
		count1 = coinCase.GetCount(100);
		System.out.println("100円玉は" + count1 + "枚です");
		count1 = coinCase.GetCount(50);
		System.out.println("50円玉は" + count1 + "枚です");
		count1 = coinCase.GetCount(10);
		System.out.println("10円玉は" + count1 + "枚です");
		count1 = coinCase.GetCount(5);
		System.out.println("5円玉は" + count1 + "枚です");
		count1 = coinCase.GetCount(1);
		System.out.println("1円玉は" + count1 + "枚です");

		int amount1;
		amount1 = coinCase.GetAmount();
		System.out.println("総額は" + amount1 + "円です");

	}

}
