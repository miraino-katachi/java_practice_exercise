
public class Exercise10 {

	/*
	 * 検証処理
	 */
	public static void main(String[] args) {
		for (int n = 11; n <= 20; n++) {
			System.out.print(fibonacci(n) + " ");
		}
	}

	/*
	 * フィボナッチ数列 n番目の数字を返す
	 */
	static int fibonacci(int n) {
		if (n == 0) return 0;			// 0項目は0
		else if (n == 1) return 1;		// 1項目は1
		else return fibonacci(n - 2) + fibonacci(n - 1);	// n項目は、(n-2)項目 + (n-1)項目
	}

}
