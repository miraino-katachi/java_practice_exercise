
public class Exercise06 {

	/*
	 * 検証処理
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			kukuColumn(i);
		}
	}

	/*
	 * 九九の一つの段を表示
	 */
	static void kukuColumn(int num) {
		for (int i = 1; i <= 9; i++) {
			System.out.print(num * i + " ");

			/*
			 * 桁揃えを行いたい場合はprintf()が便利
			 * 書式(フォーマット)を指定して表示が可能
			 * 「%2d」は2桁数字・右詰めの指定
			 */
			// System.out.printf("%2d ", num * i);
		}

		System.out.println();
	}

}
