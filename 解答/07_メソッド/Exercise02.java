
public class Exercise02 {

	/*
	 * 検証処理
	 */
	public static void main(String[] args) {
		System.out.println("3と7の平均=" + average(3, 7));
		System.out.println("4と9の平均=" + average(4, 9));
	}

	/*
	 * 平均値を返す
	 */
	static int average(int x, int y) {
		return (x + y) / 2;
	}

}
