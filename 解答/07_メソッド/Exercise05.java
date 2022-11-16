
public class Exercise05 {

	/*
	 * 検証処理
	 */
	public static void main(String[] args) {
		drawTriangle(3, '%');
		System.out.println();

		drawTriangle(5, '#');
		System.out.println();

		drawTriangle(7, '@');
	}

	/*
	 * 指定文字で三角形を表示
	 * 処理の流れは設問04と同様
	 * 表示文字が固定文字ではなくメソッドの第2引数にする
	 */
	static void drawTriangle(int size, char ch) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
