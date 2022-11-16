/**
 * 猫クラス
 *
 */
public class Cat extends Animal {

	/**
	 * 名前、年齢を指定するコンストラクタ
	 * @param name 名前
	 * @param age 年齢
	 */
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * 寝る
	 */
	public void sleep() {
		System.out.println("スースー");
	}

	@Override
	public void speak() {
		System.out.println("ニャー");
	}

}
