/**
 * 犬クラス
 *
 */
public class Dog {

	/** 名前 */
	private String name;

	/**
	 * 名前設定
	 * @param name 設定する名前
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 名前表示
	 */
	public void showName() {
		System.out.println("名前は" + name + "です");
	}

}
