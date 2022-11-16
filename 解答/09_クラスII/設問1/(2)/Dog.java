/**
 * 犬クラス
 *
 */
public class Dog {

	/** 名前 */
	private String name;
	/** 年齢 */
	private int age;

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
	 * プロフィール表示
	 */
	public void showProfile() {
		System.out.println("名前は" + this.name + "、" + this.age + "歳です");
	}

	/**
	 * 走る
	 */
	public void run() {
		System.out.println("トコトコ");
	}

}
