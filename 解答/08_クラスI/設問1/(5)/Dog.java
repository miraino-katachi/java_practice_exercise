/**
 * 犬クラス
 *
 */
public class Dog {

	/** 名前 */
	private String name;

	/** 年齢 */
	private int age;

	/** 犬種 */
	private String type;

	/**
	 * コンストラクタ
	 * @param type 犬種
	 */
	public Dog(String type) {
		this.type = type;
	}

	/**
	 * 名前設定
	 * @param name 設定する名前
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 年齢設定
	 * @param age 設定する年齢
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 名前表示
	 */
	public void showName() {
		System.out.println("名前は" + this.name + "です");
	}

	/**
	 * プロフィール表示
	 */
	public void showProfile() {
		System.out.println("名前は" + this.name + "、年齢は" + this.age + "歳、犬種は" + this.type + "です");
	}

}
