/**
 * 猫クラス
 *
 */
public class Cat {

	/** 名前 */
	private String name;
	/** 年齢 */
	private int age;

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
	 * プロフィール表示
	 */
	public void showProfile() {
		System.out.println("名前は" + this.name + "、" + this.age + "歳です");
	}

	/**
	 * 寝る
	 */
	public void sleep() {
		System.out.println("スースー");
	}

}
