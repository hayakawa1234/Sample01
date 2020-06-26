package test;
/**
 *〇　練習問題 7 - 2
 * 前問の Dog クラスに、次の内容を追加しなさい。
 * 
 * 年齢を保持する int 型のメンバー変数。
 * 年齢を設定するメンバー・メソッド、SetAge。
 * ShowProfile メソッドで名前、年齢を表示するようにする。
 * 修正した Dog クラスを使用して次のプログラムを作成しなさい。
 * 
 * Dog クラスのインスタンスを作成する。
 * 名前、年齢を設定する。
 * プロフィールを表示する。
 * 
 *〇　練習問題 7 - 3
 *前問の Dog クラスを使用して次のプログラムを作成しなさい。
 *
 *Dog クラスのインスタンスを２つ作成する。
 *１つ目のインスタンスに、名前、年齢を設定する。
 *２つ目のインスタンスに、名前、年齢を設定する。
 *１つ目のインスタンスの、プロフィールを表示する。
 *２つ目のインスタンスの、プロフィールを表示する。 
 *
 *〇　練習問題 7 - 4
 *前問の Dog クラスに、次の内容を追加しなさい。
 *
 *犬種を保持するメンバー変数。（ String 型）
 *犬種を設定する引数（ String ）を持つコンストラクタ。
 *ShowProfile メソッドを犬種、名前、年齢、を表示するようにする。
 *修正した Dog クラスを使用して次のプログラムを作成しなさい。
 *
 *犬種を指定して Dog クラスのインスタンスを作成する。
 *名前、年齢を設定する。
 *プロフィールを表示する。
 */

/**
 * @author hayak
 *
 */

class Dog {
	private String Name;
	int dogAge;
	String dogBreed;
	
	Dog(String br) {
		dogBreed = br;
	}
	
	public void SetName(String nm) {
		Name = nm;
	}
	
	public void SetAge(int age) {
		dogAge = age;
	}

	public void ShowProfile() {
		System.out.println("名前は、" + Name + "です。");
		System.out.println("年齢は 、" + dogAge + "歳です。");
		System.out.println("犬種は" + dogBreed + "です");
	}
}

public class Sample02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog dog1 = new Dog("プードル");
		Dog dog2 = new Dog("コーギー");
		dog1.SetName("mike");
		dog1.SetAge(12);
		dog1.ShowProfile();
		dog2.SetName("tama");
		dog2.SetAge(9);
		dog2.ShowProfile();
	}

}
