public class Animal {

	/** 名前 */
	protected String name;
	/** 年齢 */
	protected int age;

	/**
	 * プロフィール表示
	 */
	public void showProfile() {
		System.out.println("名前は" + this.name + "、" + this.age + "歳です");
	}

	/**
	 * 話す
	 */
	public void speak() {
		System.out.println("......");
	}
}
