/**
 *〇 練習問題 8 - 1
 *以下の Animal クラスを継承したクラス（派生クラス）、Cat を作成しなさい。
 *
 *Cat はメンバー・メソッド Sleep を持つ。
 *Sleep を実行すると“スースー”という文字列を表示する。
 *次のプログラムを作成しなさい。
 *
 *Cat クラスのインスタンスを作成する。
 *public のメンバー変数、Name、Age に名前、年齢を設定する。
 *ShowProfile を実行する。
 *Sleep を実行する。
 *
 *〇 練習問題 8 - 2
 *前問に加え Animal クラスを継承したクラス、Dog を作成しなさい。
 *
 *Dog はメンバー・メソッドRunを持つ。
 *Run を実行すると“トコトコ”という文字列を表示する。
 *次のプログラムを作成しなさい。
 *
 *Cat クラスと Dog クラスのインスタンスを作成する。
 *それぞれのメンバー変数、Name、Age に名前、年齢を設定する。
 *それぞれの ShowProfile を実行する。
 *Cat のインスタンスの Sleep を実行する。
 *Dog のインスタンスの Run を実行する。
 */

/**
 * @author hayak
 *
 */
class Animal {
	public String Name;
	public int Age;
	
	public void SetName(String nm) {
		Name = nm;
	}
	
	public void SetAge(int age) {
		Age = age;
	}

	public void ShowProfile() {
		System.out.println("名前は、" + Name + "、" + Age + "歳です。");
	}
}

class Cat extends Animal {
	public String Talk;
	
	public void Sleep(String talk) {
		Talk = talk;
		System.out.println("スースー");
	}
}

public class Sample04 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.SetName("たま");
		cat.SetAge(5);
		cat.ShowProfile();
		cat.Sleep("");
	}

}
