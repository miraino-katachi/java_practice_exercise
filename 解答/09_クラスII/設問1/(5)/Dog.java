/**
 * 犬クラス
 *
 */
public class Dog extends Animal {

	/**
	 * 名前、年齢を指定するコンストラクタ
	 * @param name 名前
	 * @param age 年齢
	 */
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * 走る
	 */
	public void run() {
		System.out.println("トコトコ");
	}

}
