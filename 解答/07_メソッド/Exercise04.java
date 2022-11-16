
public class Exercise04 {

	/*
	 * 検証処理
	 */
	public static void main(String[] args) {
		drawTriangle(3);
		System.out.println();

		drawTriangle(4);
		System.out.println();

		drawTriangle(5);
	}

	/*
	 * 三角形を表示
	 */
	static void drawTriangle(int size) {
		// 指定数だけ行ループ
		for (int i = 0; i < size; i++) {

			// 各行で文字($)を表示
			// 表示数 = 現在行(= i)
			for (int j = 0; j <= i; j++) {
				System.out.print("$");
			}

			// 行末の改行
			System.out.println();
		}
	}

}
